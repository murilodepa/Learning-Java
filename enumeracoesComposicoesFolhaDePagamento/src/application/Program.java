package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.enums.WorkLevel;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	System.out.print("Enter department's name: ");
	String departmentName = sc.nextLine();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	sc.nextLine();
	System.out.println("Enter worker data:");
	System.out.print("Name: ");
	String workName = sc.nextLine();
	
	System.out.print("level: ");
	String worklevel = sc.nextLine();
	
	System.out.print("Base salary: ");
	double baseSalary = sc.nextDouble();
	
	Worker worker;
	worker = new Worker(workName, WorkLevel.valueOf(worklevel), baseSalary, new Department (departmentName));
	
	System.out.print("How many contracts to this worker? ");
	int n = sc.nextInt();
	
	for(int i=0; i<n; i++) {
		System.out.println("Enter contract #" + 1 + "data:");
		System.out.print("Date: (DD/MM/YYYY): ");
		Date dataContrato = sdf.parse(sc.next());
	
		System.out.print("Date: (DD/MM/YYYY): ");
	}
	
	Date (DD/MM/YYYY): 20/08/2018
	Value per hour: 50.00
	Duration (hours): 20
	Enter contract #2 data:
	Date (DD/MM/YYYY): 13/06/2018
	Value per hour: 30.00
	Duration (hours): 18
	Enter contract #3 data:
	Date (DD/MM/YYYY): 25/08/2018
	Value per hour: 80.00
	Duration (hours): 10
	Enter month and year to calculate income (MM/YYYY): 08/2018
	Name: Alex
	Department: Design
	Income for 08/2018: 3000.00
		
sc.close();
	}

}
