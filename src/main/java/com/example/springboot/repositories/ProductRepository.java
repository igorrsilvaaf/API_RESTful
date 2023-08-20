package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

@Registered
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

}
