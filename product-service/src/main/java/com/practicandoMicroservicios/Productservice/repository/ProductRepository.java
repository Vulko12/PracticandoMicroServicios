package com.practicandoMicroservicios.Productservice.repository;

import com.practicandoMicroservicios.Productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}