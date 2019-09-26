package com.cg.demojpa.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="jpa_employee")
public class Employee {
	
	
	@Id
	@GeneratedValue
	@Column(name="emp_id")
	private Integer empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="emp_salary")
	private Double empSalary;
	@Temporal(TemporalType.DATE)
	private Date dateOfJoining;
	@Embedded
	private Address addr;
	@OneToOne(cascade=CascadeType.ALL)
	private Project proj;
	@ManyToOne(cascade=CascadeType.ALL)
	private Department dep;
	
	public Employee() {
		super();
	}

	

	public Employee(Integer empId, String empName, Double empSalary, Date dateOfJoining, Address addr, Project proj,
			Department dep) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.dateOfJoining = dateOfJoining;
		this.addr = addr;
		this.proj = proj;
		this.dep = dep;
	}



	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	

	public Project getProj() {
		return proj;
	}

	public void setProj(Project proj) {
		this.proj = proj;
	}
	
	

	public Department getDep() {
		return dep;
	}



	public void setDep(Department dep) {
		this.dep = dep;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", dateOfJoining="
				+ dateOfJoining + ", addr=" + addr + ", proj=" + proj + ", dep=" + dep + "]";
	}





}
