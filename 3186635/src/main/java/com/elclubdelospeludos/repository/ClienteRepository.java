package com.elclubdelospeludos.repository;

import com.elclubdelospeludos.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <ClienteEntity, Long> {
}


/*
Metodos JPA:
CRUD
 - save() // Guardar
 - findAll() // listar todos
 - finById() // listar por Id
 - deleteById() // eliminar por Id
*/
