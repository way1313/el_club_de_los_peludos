package com.elclubdelospeludos.controller;


import com.elclubdelospeludos.entity.ClienteEntity;
import com.elclubdelospeludos.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.List;



@Controller
@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    //CRUD

    //CREATE - Crear un Cliente
    @PostMapping("/crear")
    public ClienteEntity crearCliente(@RequestBody ClienteEntity clienteEntity){
        clienteService.crearCliente(clienteEntity);
        return clienteEntity;
    }



    //READ - listar todos los clientes
    @GetMapping
    public List <ClienteEntity>listarClientes(){
        return clienteService.listarClientes();


    }


    // Listar Cliente por ID
    @GetMapping("/{id}")
    public  Optional<ClienteEntity> listarCliente(@PathVariable("id") Long id){

        return clienteService.listarCliente(id);
    }


    // UPDATE - editar - actualizar cliente
    @PutMapping("/editar/{id}")
    public ClienteEntity editarCliente(@RequestBody ClienteEntity clienteEntity, @PathVariable("id") Long id){
        clienteService.editarCliente(id,clienteEntity);
        return clienteEntity;
    }

    //DELETE - eliminar cliente
    @DeleteMapping("eliminar/{id}")
    public void eliminarCliente(@PathVariable("id") Long id){
        clienteService.eliminarCliente(id);
    }
}
