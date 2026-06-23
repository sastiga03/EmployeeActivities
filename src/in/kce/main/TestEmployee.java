package in.kce.main;

import java.util.ArrayList;
import java.util.Scanner;

import in.kce.bean.Employee;
import in.kce.service.EmployeeService;

public class TestEmployee {
public static void main(String[] args) {
	//switch for menu
	System.out.println("Employee Management"
			+ "1. Store Employee" +" "
			+ "2. Update Employee"+ " "
			+ "3. Delete"+" "
			+ "4. Fetch Employee" +" "
			+ "5. Fetch All Employee");
	Scanner sc =new Scanner(System.in);
	int option=sc.nextInt();
	switch (option) {
	case 1: {
		int id=sc.nextInt();
		String name=sc.next();
		String designation=sc.next();
		EmployeeService employeeService=new EmployeeService();
		boolean result=employeeService.saveEmployee(id,name,designation);
		if(result) {
			System.out.println("Inserted");
		}
		break;
	}
	case 2 : {
		String name=sc.next();
		int id=sc.nextInt();
		EmployeeService employeeService=new EmployeeService();
		boolean result=employeeService.updateEmployee(id,name);
		if(result) {
			System.out.println("Updated");
		}
		break;
	}
	case 3 :{
		int id=sc.nextInt();
		EmployeeService employeeService=new EmployeeService();
		boolean result=employeeService.deleteEmployee(id);
		if(result) {
			System.out.println("Deleted");
		}
		break;
	}
	case 4 : {
	    int id = sc.nextInt();

	    EmployeeService employeeService = new EmployeeService();
	    Employee emp = employeeService.getEmployee(id);

	    if(emp != null) {
	        System.out.println("ID : " + emp.getEmpId());
	        System.out.println("Name : " + emp.getEmpName());
	        System.out.println("Designation : " + emp.getDesignation());
	    } else {
	        System.out.println("Employee not found");
	    }

	    break;
	}
	case 5 : {
		EmployeeService employeeService=new EmployeeService();
		ArrayList<Employee> l=employeeService.getAllEmployees();
		if(!l.isEmpty()) {
			for(Employee emp : l) {
	        System.out.println("ID : " + emp.getEmpId());
	        System.out.println("Name : " + emp.getEmpName());
	        System.out.println("Designation : " + emp.getDesignation());
	    }
		}else {
	        System.out.println("Employee not found");
	    }

		break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + option);
	}
	
}
}
