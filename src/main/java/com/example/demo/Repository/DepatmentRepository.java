package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Department;

public interface DepatmentRepository extends CrudRepository<Department,Long> {

}
