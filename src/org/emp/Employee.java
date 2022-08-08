package org.emp;
import java.util.Scanner;
public class Employee {
      private void empDetails() {
		// TODO Auto-generated method stub
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Id:");
        int empId = sc.nextInt();
        System.out.println("Employee Id:"+empId);
        System.out.println("Enter Employee Name:");
        String empName = sc.nextLine();
        System.out.println("Employee Name:"+empName);
        System.out.println("Enter Employee email:");
        String email = sc.next();
        System.out.println("Employee email:"+email);
        System.out.println("Enter Employee phone no:");
        long phone = sc.nextLong();
        System.out.println("Employee Phone:"+phone);
        System.out.println("Enter Employee Salary:");
        float salary = sc.nextFloat();
        System.out.println("Employee salary:"+salary);
        System.out.println("Enter Employee Gender:");
        String gender = sc.next();
        System.out.println("Employee gender:"+gender);
        System.out.println("Enter Employee City:");
        String city = sc.next();
        System.out.println("Employee city:"+city);
	}
      
}
