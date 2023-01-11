package com.example.demo.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.DepatmentRepository;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Utils.Response;
import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Enterprise;


@Service
public class DepatmentServiceImpl extends GenericServiceImpl<Department,DepatmentRepository> implements IDepartmentService{

	
	@Autowired
	private DepatmentRepository departmentRepository;
	
	@Override
	public Response<Department> update(Long id, Department department) {
Response response=new Response<Department>();
		
		try {
			Department actualDepartment=departmentRepository.findById(id).orElse(null);
			if(actualDepartment!=null) {
				actualDepartment.setName(department.getName()!=null?department.getName():actualDepartment.getName());
				actualDepartment.setDescription(department.getDescription()!=null?department.getDescription():actualDepartment.getDescription());
				actualDepartment.setPhone(department.getPhone()!=null?department.getPhone():actualDepartment.getPhone());
				actualDepartment.setStatus(department.getStatus()!=null?department.getStatus():actualDepartment.getStatus());
				actualDepartment.setEnterprise(department.getEnterprise()!=null?department.getEnterprise():actualDepartment.getEnterprise());
			}
			response.Data=departmentRepository.save(actualDepartment);	
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
