package io.sejal.springboot.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import io.sejal.springboot.model.*;
import io.sejal.springboot.repository.*;
import io.sejal.springboot.service.CartService;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private UserRepository userRepository;
    
    public Cart createCart(Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null && user.getCart() == null) {
            Cart cart = new Cart();
            cart.setUser(user);
            cart.setCartItems(new ArrayList<>());
            return cartRepository.save(cart);
        }
        return null;
    }

    public Cart getCartByUserId(Long userId) {
        return cartRepository.findByUserId(userId);
    }

    public Cart addToCart(Long userId, Long productId, int quantity) {
        Cart cart = cartRepository.findByUserId(userId);
        Product product = productRepository.findById(productId).orElse(null);

        if (cart != null && product != null) {
            CartItem item = new CartItem();
            item.setCart(cart);
            item.setProduct(product);
            item.setQuantity(quantity);

            cart.getCartItems().add(item);
            cartItemRepository.save(item);
            return cartRepository.save(cart);
        }
        return null;
    }

    public Cart removeItemFromCart(Long userId, Long productId) {
        Cart cart = cartRepository.findByUserId(userId);
        if (cart != null) {
            List<CartItem> updatedItems = new ArrayList<>();
            for (CartItem item : cart.getCartItems()) {
                if (!item.getProduct().getId().equals(productId)) {
                    updatedItems.add(item);
                } else {
                    cartItemRepository.delete(item);
                }
            }
            cart.setCartItems(updatedItems);
            return cartRepository.save(cart);
        }
        return null;
    }

    public void clearCart(Long userId) {
        Cart cart = cartRepository.findByUserId(userId);
        if (cart != null) {
            for (CartItem item : cart.getCartItems()) {
                cartItemRepository.delete(item);
            }
            cart.setCartItems(new ArrayList<>());
            cartRepository.save(cart);
        }
    }

	@Override
	public Cart removeFromCart(Long userId, Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart viewCart(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}
}