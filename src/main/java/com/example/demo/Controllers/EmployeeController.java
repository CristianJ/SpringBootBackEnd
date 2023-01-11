package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.IEmployeeService;
import com.example.demo.Utils.Response;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Enterprise;


@RestController
@RequestMapping("/api/employee")
public class EmployeeController extends GenericController<Employee,IEmployeeService> {
	

	@PutMapping("/{id}")
	public Response<Employee> update(@PathVariable Long id,@RequestBody Employee employee ){
		return service.update(id, employee);
	}

}
