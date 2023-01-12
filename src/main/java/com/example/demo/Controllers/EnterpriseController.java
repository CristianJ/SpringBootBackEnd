package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.EnterpriseServiceImpl;
import com.example.demo.Utils.Response;
import com.example.demo.entity.Enterprise;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/enterprise")
public class EnterpriseController {

	@Autowired
	private EnterpriseServiceImpl enterpriseService;
	
	@GetMapping
	public Response<Iterable<Enterprise>> getAll(){
		return enterpriseService.getAll();
	}
	
	@PostMapping
	public Response<Enterprise> save(@RequestBody Enterprise enterprise ){
		return enterpriseService.save(enterprise);
	}
	
	@PutMapping("{id}")
	public Response<Enterprise> update(@PathVariable Long id,@RequestBody Enterprise enterprise ){
		return enterpriseService.update(id, enterprise);
	}
	
	
}
