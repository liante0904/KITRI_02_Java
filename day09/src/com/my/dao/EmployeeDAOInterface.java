package com.my.dao;

import com.my.dto.Employee;
import com.my.exception.AddException;
import com.my.exception.DuplicatekeyException;
public interface EmployeeDAOInterface {
	void add(Employee e) throws AddException, DuplicatekeyException;
	Employee[] selectAll();
	Employee selectByNo(String no);
}
