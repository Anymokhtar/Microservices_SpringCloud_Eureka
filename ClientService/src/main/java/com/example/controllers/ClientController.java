package com.example.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Client.entities.Client;
import com.example.services.ClientServiceImpl;

import java.util.List;


@RestController
@RequestMapping("api/client")
@CrossOrigin(origins = {"http://localhost:3000/","http://localhost:4200/"})
public class ClientController {
    @Autowired
    private ClientServiceImpl service;
    @GetMapping
    public List<Client> findAll(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Client findById(@PathVariable Long id) throws Exception {return service.findById(id);}
    @PostMapping
    public void addClient(@RequestBody Client client){service.addClient(client);}
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) throws Exception {service.delete(id);}

    @PutMapping("/{id}")
    public void updateClient(@RequestBody Client client,@PathVariable Long id) throws Exception {service.update(client,id);}
}