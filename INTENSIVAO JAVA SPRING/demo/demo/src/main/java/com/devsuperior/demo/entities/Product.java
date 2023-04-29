package com.devsuperior.demo.entities;

public class Product
 {
     private  Long id;
     private  String name;
     private Double prince;

    private Department department;

    public  Product( ) {

    }

     public Long getId() {
         return id;
     }

     public void setId(Long id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Double getPrince() {
         return prince;
     }

     public void setPrince(Double prince) {
         this.prince = prince;
     }

     public Department getDepartment() {
         return department;
     }

     public void setDepartment(Department department) {
         this.department = department;
     }
 }
