package com.admin.cliente.admincliente.controller;

import com.admin.cliente.admincliente.model.Produc;
import com.admin.cliente.admincliente.repository.ProductRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRep productRep;

    @PostMapping("/crear")
    public Produc save(@RequestBody Produc produc){
        return  productRep.save(produc);
    }

    @GetMapping
    public List<Produc> finAll(){
        return productRep.findAll();
    }
}

