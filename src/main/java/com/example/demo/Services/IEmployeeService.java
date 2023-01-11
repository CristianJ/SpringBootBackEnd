package com.example.demo.Services;

import com.example.demo.Utils.Response;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Enterprise;

public interface IEmployeeService extends GenericService<Employee> {

	Response<Employee> update(Long id, Employee employee);

}
