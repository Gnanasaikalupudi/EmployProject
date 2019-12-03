package com.hcl.emp;

import java.util.Scanner;

public class SearchEmployMain {
	
	public static void main(String[] args) {
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employ no..");
		empno=sc.nextInt();
		EmployDAO dao=new EmployDAO();
	
		Employ employ=dao.searchEmploy(empno);
		if(employ!=null) {
			System.out.println("Name="+employ.getName());
			System.out.println("Department="+employ.getDept());
			System.out.println("Designation="+employ.getDesig());
			System.out.println("Salary="+employ.getBasic());
		} else {
			System.out.println("Record not found....");
		}
		
	}

}
