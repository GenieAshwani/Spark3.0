package com.genie.Ecomm.repo;

import com.genie.Ecomm.model.Product;
import com.genie.Ecomm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
