package model.dao;

import java.util.List;

import model.intities.Department;

public interface DepartmentDao {

	void insert(Department obj);
	void update(Department obj);
	void deleteDyId(Department id);
	Department findById(Integer id);
	List<Department > findAll();
	
}
