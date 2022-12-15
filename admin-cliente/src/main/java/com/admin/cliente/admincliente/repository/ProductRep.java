package com.admin.cliente.admincliente.repository;

import com.admin.cliente.admincliente.model.Produc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRep extends JpaRepository<Produc,Integer> {
}
