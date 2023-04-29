package com.devsuperior.demo.controller;

import com.devsuperior.demo.entities.Department;
import com.devsuperior.demo.entities.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping (value = "/products")
public class ProductController {

    @RequestMapping(value = "/products")
    public List <Product> getObjects() {
        Department d1 = new Department( 1L, 'Tech');
        Department d2= new Department( 2L , 'Pet');

        Product p1= new Product(1L,'Macbook Pro', 4000.0, d1);
        Product p2= new Product(1L,'PC Gamer', 5000.0, d1);
        Product p3= new Product(1L,'Pet House', 4000.0, d2);

        List<Product> list = ArrayasList  (p1,p2,p3);
  return d1;


    }
}
