package com.metaphorceApi.metaphorce.DAO;

import com.metaphorceApi.metaphorce.models.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class EmployeeDAOImp implements EmployeeDAO {

    @PersistenceContext
    EntityManager entityManager;
    /***
     *
     * @param id The id of an Employee
     * @return an employee who contain the id
     */
    @Override
    public Employee getEmployee(int id) {
        String query = "FROM Employee WHERE idEmployee="+id;
        return (Employee) entityManager.createQuery(query).getResultList().get(0);
    }
    /***
     *
     * @return A list with Employees who are active
     */
    @Override
    public List<Employee> getEmployeeActive() {
        String query = "FROM Employee WHERE isActive=1";
        return entityManager.createQuery(query).getResultList();
    }

    /***
     *
     * @param id The id of the employee who will be deleted from
     *           the DATABASE
     * @throws Exception if the id of the employee doesn't exist
     */
    @Override
    public void deleteEmployee(int id) throws Exception {
        Employee emp = getEmployee(id);
        if(emp!=null){
            entityManager.remove(emp);
        }else{
            throw new Exception("employee doesn't exist");
        }
    }
}
