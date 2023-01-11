package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.IDepartmentService;
import com.example.demo.Utils.Response;
import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;



@RestController
@RequestMapping("/api/department")
public class DepartmentController  extends GenericController<Department,IDepartmentService>  {

	@PutMapping("/{id}")
	public Response<Department> update(@PathVariable Long id,@RequestBody Department department ){
		return service.update(id, department);
	}
}



