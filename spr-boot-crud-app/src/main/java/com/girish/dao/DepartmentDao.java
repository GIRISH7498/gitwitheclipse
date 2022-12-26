package com.girish.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.girish.entity.Department;
@Repository
public interface DepartmentDao extends CrudRepository<Department, Integer>
{
	
}
