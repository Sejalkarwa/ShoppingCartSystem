package io.sejal.springboot.repository;

import io.sejal.springboot.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long>{
	Cart findByUserId(Long userId);

}
