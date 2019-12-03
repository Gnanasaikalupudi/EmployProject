package com.hcl.emp;

import java.util.Scanner;

public class DeleteEmployMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employ no..");
		empno=sc.nextInt();
		EmployDAO dao=new EmployDAO();
		System.out.println(dao.deleteEmploy(empno));
	
		
		
		
	}

}
