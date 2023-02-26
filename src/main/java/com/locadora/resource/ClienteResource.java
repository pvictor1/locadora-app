package com.locadora.resource;

import com.locadora.model.Cliente;
import com.locadora.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/locadora")
public class ClienteResource {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public List<Cliente> listaClientes(){
        return clienteRepository.findAll();
    }

    @GetMapping("/cliente/{id}")
    public Cliente clienteById(@PathVariable(value="id") long id){
        return clienteRepository.findById(id);
    }


    @PostMapping("/cliente")
    public Cliente salvaCliente(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/cliente/{id}")
    public void deletaCliente(@PathVariable(value="id") long id){
        clienteRepository.deleteById(id);
    }

    @PutMapping("/cliente")
    public Cliente atualizaCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }









}
