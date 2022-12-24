package com.programming.service.productservice.controller;

import com.programming.service.productservice.model.Product;
import com.programming.service.productservice.repository.ProdeuctRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProdeuctRepository prodeuctRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll(){
        return prodeuctRepository.findAll() ;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Product product){
        prodeuctRepository.save(product);
    }
}
