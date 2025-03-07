package assignment;

import java.util.ArrayList;
import java.util.List;

public class Employee {
int id;
String name;
double salary;

public Employee(int id, String name, double salary) {
	
	this.id=id;
	this.name=name;
	this.salary=salary;
	
}


    void displayDetails() {
    	System.out.println("["+this.id+"\t"+this.name+"\t"+this.salary+"]");
	  
  }
    @Override
    public String toString() {
    	return this.id+","+this.name+","+this.salary;
    }
    
    public static void main(String[] args) {
    	Employee e1=new Employee(101,"Divya Prakash",500000.00);
    	Employee e2=new Employee(102,"Sanjeet Kumar",1500000.00);
    	Employee e3=new Employee(103,"Sumit Kumar",450000.00);
		
    	ArrayList<Employee> Employees=new ArrayList<>();
    	
    	Employees.add(e1);
    	Employees.add(e2);
    	Employees.add(e3);
    	System.out.println("  Employee Management System  ");
    	System.out.println("================================");
    	System.out.println("Emp ID    Emp Name     Emp Salary ");
    	System.out.println("--------------------------------");
//    	System.out.println(al);
    	
    	for(Employee emp:Employees) {
//    		Employee em=(Employee)e;
//    		System.out.println("["+e+"]\t");
//    		System.out.println("["+em.id+"\t"+em.name+"\t"+em.salary+"]");
    		emp.displayDetails();
    	}
    	
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
