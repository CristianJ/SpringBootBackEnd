package com.example.demo.Services;
import com.example.demo.Utils.Response;
import com.example.demo.entity.Enterprise;

import java.util.List;
import java.util.Optional;

public interface IEnterpriseService {

	public Response<Iterable<Enterprise>> getAll();
	
	public Response<Enterprise> save(Enterprise enterprise);
	
	public Response<Enterprise> update(Long id,Enterprise enterprise);
	
	public Response<Enterprise> findById(Long id);
	
	
}
