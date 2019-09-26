package com.cg.demojpa.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.demojpa.dto.Department;
import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.dto.Project;

public class EmployeeDaoImpl implements EmployeeDao {
	
	EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("demojpa");
    
	@Override
	public Employee save(Employee emp) {
		EntityManager em =entityFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Department dp =em.find(Department.class, emp.getDep().getDeptId());
		if(dp!=null) {
			emp.setDep(dp);
		}
		em.persist(emp);
	    transaction.commit();
	
		return null;
	}
	@Override
	public List<Employee> findAll() {
		EntityManager em= entityFactory.createEntityManager();
		 
		Query query = em.createQuery("From Employee");
		List<Employee> emps = query.getResultList();
		
		return emps;
	}

	@Override
	public void remove(Integer empId) {
		
		EntityManager em= entityFactory.createEntityManager();
		Employee emp = em.find(Employee.class, empId);
		
		Employee emp1 = new Employee();
		if(emp==null) {
			return;
		}
		emp1.setEmpId(emp.getEmpId());
		emp1.setEmpName(emp.getEmpName());
		emp1.setEmpSalary(emp.getEmpSalary());
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		Employee emp2 = em.merge(emp1);
		em.remove(emp2);
		tran.commit();
	}
	
	public List<Employee> findBetweenSalary(Double min,Double max){
		EntityManager em = entityFactory.createEntityManager();
		Query query = em.createQuery("From Employee where empSalary Between :first ANd :second");
		query.setParameter("first", min);
		query.setParameter("second", max);
		List<Employee> empList = query.getResultList();
		return empList;
	}
	
	public List<Employee> getEmployeesInDept(Integer deptId){
		
		EntityManager em = entityFactory.createEntityManager();
		Department dep = em.find(Department.class,deptId);
		Query query = em.createQuery("From Employee e where dep = :first");
		query.setParameter("first",dep);
		List<Employee> employees = query.getResultList();
		return employees;
		
	}
	
	

}
