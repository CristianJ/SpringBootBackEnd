package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Services.EnterpriseServiceImpl;
import com.example.demo.Services.GenericService;
import com.example.demo.Utils.Response;
import com.example.demo.entity.Enterprise;

public class GenericController<E,S extends GenericService<E>> {

	@Autowired
	protected S service;
	
	@GetMapping
	public Response<Iterable<E>> getAll(){
		return service.getAll();
	}
	
	@PostMapping
	public Response<E> save(@RequestBody E entity ){
		return service.save(entity);
	}
	
	
}
