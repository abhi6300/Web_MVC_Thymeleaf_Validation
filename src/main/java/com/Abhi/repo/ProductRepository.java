package com.Abhi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Abhi.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
