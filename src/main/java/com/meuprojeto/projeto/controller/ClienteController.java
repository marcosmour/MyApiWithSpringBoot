package com.meuprojeto.projeto.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meuprojeto.projeto.model.Cliente;
import com.meuprojeto.projeto.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostMapping
	public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@GetMapping
	public List<Cliente> buscarCliente(){
		return clienteRepository.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void Cliente(@PathVariable("id") UUID id) {
		clienteRepository.deleteById(id);
	}
	
	@PutMapping("{id}")
	public Cliente atualizarCliente(@PathVariable(value = "id") UUID id, @RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
