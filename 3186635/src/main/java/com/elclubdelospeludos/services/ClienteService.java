package com.elclubdelospeludos.services;

import com.elclubdelospeludos.entity.ClienteEntity;
import com.elclubdelospeludos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service

public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    // CRUD

    //CREATE - crear nuevo cliente
    public void crearCliente(ClienteEntity clienteEntity) {
         clienteRepository.save(clienteEntity);
    }

    //READ - Listar todos clienetes
    public List<ClienteEntity> listarClientes() {
        return clienteRepository.findAll();
    }

    //Listar cliente por ID
    public Optional<ClienteEntity> listarCliente(Long id) {
        return clienteRepository.findById(id);
    }

    //UPDATE - editar - actualizar cliente
    public void editarCliente(Long id, ClienteEntity clienteEntity) {
        clienteRepository.save(clienteEntity);
    }


    //DELETE - eliminar cliente
    public boolean eliminarCliente(Long Id) {
        if (clienteRepository.existsById(Id)){
            clienteRepository.deleteById(Id);
            return true;
        }
        return false;
    }
}
