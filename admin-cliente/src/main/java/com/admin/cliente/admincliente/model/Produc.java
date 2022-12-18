package com.admin.cliente.admincliente.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class Produc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int precio;

    private String descripcion;

    private String categoria;

    private String existentes;

}
