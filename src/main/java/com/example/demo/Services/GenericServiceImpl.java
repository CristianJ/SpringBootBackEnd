package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Utils.Response;
import com.example.demo.entity.Enterprise;


public class GenericServiceImpl<E,R extends CrudRepository<E,Long>> implements GenericService<E> {

	@Autowired
	protected R repository;
	@Override
	public Response getAll() {
		// TODO Auto-generated method stub

		Response response=new Response<Iterable<Enterprise>>();
		
		try {
			response.Data=repository.findAll();	
			if(response.Data!=null) {
				response.isSuccess=true;
				response.Message="CONSULTA EXITOSA";
			}
		}catch(Exception e ) {
			response.Message=e.toString();
		}
		
		return response;
	}

	@Override
	public Response<E> save(E entity) {
		// TODO Auto-generated method stub
Response response=new Response<Enterprise>();
		
		try {
			response.Data=repository.save(entity);	
			if(response.Data!=null) {
				response.isSuccess=true;
				response.Message="CONSULTA EXITOSA";
			}
		}catch(Exception e ) {
			response.Message=e.toString();
		}
		
		return response;
		
	}

	@Override
	public Response<E> findById(Long id) {
Response response=new Response<E>();
		
		try {
			response.Data=repository.findById(id).orElse(null);
			if(response.Data!=null) {
				response.isSuccess=true;
				response.Message="CONSULTA EXITOSA";
			}
		}catch(Exception e ) {
			response.Message=e.toString();
		}
		
		return response;
	}

	

}
