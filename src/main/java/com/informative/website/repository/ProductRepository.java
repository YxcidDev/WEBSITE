package com.informative.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informative.website.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}
