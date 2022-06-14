package com.metaphorceApi.metaphorce.controllers;

import com.metaphorceApi.metaphorce.DAO.ContractDAOImp;
import com.metaphorceApi.metaphorce.DAO.EmployeeDAOImp;
import com.metaphorceApi.metaphorce.models.Contract;
import com.metaphorceApi.metaphorce.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private EmployeeDAOImp employeeDAO;

    @Autowired
    private ContractDAOImp contractDAO;


    @RequestMapping(value = "/employees/active")
    public List<Employee> getEmpActive(){
        return employeeDAO.getEmployeeActive();
    }

    @RequestMapping(value = "/employees/{id}")
    public Employee getEmp(int id){
        return employeeDAO.getEmployee(id);
    }

    @RequestMapping(value = "/Contracts")
    public List<Contract> getCon(){
        return contractDAO.getContracts();
    }
}
