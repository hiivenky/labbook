package com.cg.demojpa.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.cg.demojpa.dto.Address;
import com.cg.demojpa.dto.Department;
import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.dto.Project;
import com.cg.demojpa.service.EmployeeService;
import com.cg.demojpa.service.EmployeeServiceImpl;

public class MyApplication {
	
	public static void main(String[] args) throws ParseException {
		
		EmployeeService service= new EmployeeServiceImpl();
//		for(int i=0;i<2;i++) {
//		EmployeeService service= new EmployeeServiceImpl();
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter Id");
//		int id = scr.nextInt();
//		System.out.println("Enter Name");
//		String name = scr.next();
//		System.out.println("Enter salary");
//		double sal = scr.nextDouble();
//		System.out.println("Enter the date of joining");
//		String date = scr.next();
//		System.out.println("Enter the city");
//		String city = scr.next();
//		System.out.println("Enter the state");
//		String state = scr.next();
//		System.out.println("ENter the pincode");
//		String pincode = scr.next();
//		Address address = new Address();
//		address.setCity(city);
//		address.setPincode(pincode);
//		address.setState(state);
//		System.out.println("Enter the project id");
//		int pid=scr.nextInt();
//		System.out.println("Enter the project name");
//		String pname=scr.next();
//		System.out.println("Enter the project cost");
//		Double pcost=scr.nextDouble();
//		Project proj = new Project();
//		proj.setProjCost(pcost);
//		proj.setProjId(pid);
//		proj.setProjName(pname);
//		Department dp = new Department();
//		System.out.println("Enter the departmnet id");
//		int deptId=scr.nextInt();
//		System.out.println("Enter the departmnet name");
//		String deptName =  scr.next();
//		dp.setDeptId(deptId);
//		dp.setDeptName(deptName);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//		Employee emp = new Employee();
//		//emp.setEmpId(id);
//		emp.setEmpName(name);
//		emp.setEmpSalary(sal);
//		emp.setDateOfJoining(sdf.parse(date));
//		emp.setAddr(address);
//		emp.setProj(proj);
//		emp.setDep(dp);
//		service.addEmployee(emp);
//		}
		
		
//		
		for(int i=0;i<service.getEmployeesInDept(1).size();i++) {
			System.out.println(service.getEmployeesInDept(1).get(i).getEmpName());
		}
		
		
		//service.removeEmployee(4);
		
	}

}
