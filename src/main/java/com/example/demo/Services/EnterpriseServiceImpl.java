package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EnterpriseRepository;
import com.example.demo.Utils.Response;
import com.example.demo.entity.Enterprise;

@Service
public class EnterpriseServiceImpl implements IEnterpriseService{
	
	@Autowired
	private EnterpriseRepository alumnoRepository;

	public Response<Iterable<Enterprise>> getAll() {
		// TODO Auto-generated method stub
		Response response=new Response<Iterable<Enterprise>>();
		
		try {
			response.Data=alumnoRepository.findAll();	
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
	public Response<Enterprise> save(Enterprise enterprise) {
		// TODO Auto-generated method stub
Response response=new Response<Enterprise>();
		
		try {
			response.Data=alumnoRepository.save(enterprise);	
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
	public Response<Enterprise> update(Long id, Enterprise enterprise) {
		Response response=new Response<Enterprise>();
		
		try {
			Enterprise actualEnterprise=alumnoRepository.findById(id).orElse(null);
			if(actualEnterprise!=null) {
				actualEnterprise.setName(enterprise.getName()!=null?enterprise.getName():actualEnterprise.getName());
				actualEnterprise.setAdress(enterprise.getAdress()!=null?enterprise.getAdress():actualEnterprise.getAdress());
				actualEnterprise.setPhone(enterprise.getPhone()!=null?enterprise.getPhone():actualEnterprise.getPhone());
				actualEnterprise.setStatus(enterprise.getStatus()!=null?enterprise.getStatus():actualEnterprise.getStatus());
			}
			response.Data=alumnoRepository.save(actualEnterprise);	
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
	public Response<Enterprise> findById(Long id) {
		// TODO Auto-generated method stub
Response response=new Response<Enterprise>();
		
		try {
			response.Data=alumnoRepository.findById(id).orElse(null);	
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
