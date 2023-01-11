package com.example.demo.Services;

import com.example.demo.Utils.Response;
import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;

public interface IDepartmentService extends GenericService<Department> {
	Response<Department> update(Long id, Department department);
}
