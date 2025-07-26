package io.sejal.springboot.service;

import io.sejal.springboot.model.Cart;
import io.sejal.springboot.model.CartItem;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface CartService {
    Cart createCart(Long userId);
    Cart getCartByUserId(Long userId);
    Cart addToCart(Long userId, Long productId, int quantity);
    Cart removeFromCart(Long userId, Long productId);
    void clearCart(Long userId);
	Cart viewCart(Long userId);
	
}
