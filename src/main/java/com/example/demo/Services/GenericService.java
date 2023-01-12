package com.example.demo.Services;

import com.example.demo.Utils.Response;
import com.example.demo.entity.Enterprise;


public interface GenericService<E> {

	public Response<Iterable<E>> getAll();
	
	public Response<E> save(E entity);
	
	public Response<E> findById(Long id);
	
	
}
