package com.admin.cliente.admincliente.controller;

import com.admin.cliente.admincliente.model.Produc;
import com.admin.cliente.admincliente.repository.ProductRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRep productRep;

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> save(@RequestBody Produc produc){

        Produc response = productRep.save(produc);
        return new ResponseEntity<>( "Producto agregado Exitosamanete con el nombre:" + response.getName(), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Object> update(@RequestBody Produc produc){

       Produc response = productRep.save(produc);

       return new ResponseEntity<>("Prodúcto actualizado exitosamente /n" + response.getId(), HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public List<Produc> finAll(){
        return productRep.findAll();
    }

}

