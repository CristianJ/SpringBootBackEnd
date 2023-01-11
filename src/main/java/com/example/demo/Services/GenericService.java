package com.example.demo.Services;

import com.example.demo.Utils.Response;


public interface GenericService<E> {

	public Response<Iterable<E>> getAll();
	
	public Response<E> save(E entity);
	
	
}
