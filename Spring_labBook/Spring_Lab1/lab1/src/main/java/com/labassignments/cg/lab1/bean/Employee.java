package com.labassignments.cg.lab1.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee implements InitializingBean
	{
		   int empId;
		   String empName;
		   double salary;
		  //@Qualifier("Sbu1")
		   @Autowired  
		   SBU sbu;
		   int age;
		  public Employee()
		  {
			  
		  }
		public Employee(int empId, String empName, double salary, SBU sbu, int age) {
		
			this.empId = empId;
			this.empName = empName;
			this.salary = salary;
			this.sbu = sbu ;
			this.age = age;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public SBU getSbu() {
			return sbu;
		}
		public void setSbu(SBU Sbu) {
			this.sbu = sbu;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void destroy() throws Exception {
			// TODO Auto-generated method stub
			
		}
		public void afterPropertiesSet() throws Exception {
			// TODO Auto-generated method stub
			
		}
		  
	}

