package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Utils.Response;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Enterprise;

@Service
public class EmployeeServiceImpl extends GenericServiceImpl<Employee,EmployeeRepository> implements IEmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Response<Employee> update(Long id, Employee employee) {
		Response response=new Response<Enterprise>();
		
		try {
			Employee actualEmployee=employeeRepository.findById(id).orElse(null);
			if(actualEmployee!=null) {
				actualEmployee.setName(employee.getName()!=null?employee.getName():actualEmployee.getName());
				actualEmployee.setEmail(employee.getEmail()!=null?employee.getEmail():actualEmployee.getEmail());
				actualEmployee.setAge(employee.getAge()!=null?employee.getAge():actualEmployee.getAge());
				actualEmployee.setStatus(employee.getStatus()!=null?employee.getStatus():actualEmployee.getStatus());
				actualEmployee.setPosition(employee.getPosition()!=null?employee.getPosition():actualEmployee.getPosition());
				actualEmployee.setSurname(employee.getSurname()!=null?employee.getSurname():actualEmployee.getSurname());
			}
			response.Data=employeeRepository.save(actualEmployee);	
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
