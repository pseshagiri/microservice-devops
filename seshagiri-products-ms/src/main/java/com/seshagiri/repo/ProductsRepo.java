package com.seshagiri.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seshagiri.entity.Products;

@Repository
public interface ProductsRepo extends JpaRepository<Products, String>{

}
