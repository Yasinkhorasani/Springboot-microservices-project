package com.programming.service.productservice.repository;

import com.programming.service.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdeuctRepository extends MongoRepository<Product,String> {
}
