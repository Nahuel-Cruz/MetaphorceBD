package com.metaphorceApi.metaphorce.DAO;

import com.metaphorceApi.metaphorce.models.Employee;

import java.util.List;

public interface EmployeeDAO {
    Employee getEmployee(int id);
    List<Employee> getEmployeeActive();

    void deleteEmployee(int id) throws Exception;
}
