package com.girish.service;

import java.util.List;

import com.girish.entity.Department;

public interface DepartmentService 
{
	void add(Department department);
	void modify(Department department);
	void remove(int no);
	Department get(int no);
	List<Department> getAll();
}
