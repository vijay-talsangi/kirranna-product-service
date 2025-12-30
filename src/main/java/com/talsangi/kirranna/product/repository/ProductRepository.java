package com.talsangi.kirranna.product.repository;

import com.talsangi.kirranna.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
