package com.juanjo.springboot.di.app.springbootdi.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import com.juanjo.springboot.di.app.springbootdi.models.Product;

@Primary
@SessionScope
@Repository("productList")
public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L, "Memoria Corsair 32", 300L),
                new Product(2L, "CPU Intel Core 19", 850L),
                new Product(3L, "Teclado Razer 60", 180L),
                new Product(4L, "Motherboard Gygabyte", 490L));

    }

    @Override
    public List<Product> findAll() {
        return data;
    }

    @Override
    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

}
