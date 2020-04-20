package com.labassignments.cg.lab1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.labassignments.cg.lab1.bean.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext container = new 
         		ClassPathXmlApplicationContext("Bean.xml");
    	 
    	 Employee e = container.getBean("emp1",Employee.class);
         System.out.println(e.getEmpId());
         System.out.println(e.getEmpName());
         System.out.println(e.getSalary());
         System.out.println(e.getSbu().getSbuId());
         System.out.println(e.getSbu().getSbuName());
         System.out.println(e.getSbu().getSbuHead());
         container.close();
    	
    }
}
