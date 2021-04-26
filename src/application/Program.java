package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employess: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
		System.out.println("Employee #"+i+" data: ");
		System.out.print("Outsourced (y/n)?");
		char letra = sc.next().charAt(0);
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Hours: ");
		int hours = sc.nextInt();
		System.out.print("Value per hour: ");			
		double valueHour = sc.nextDouble();
		if(letra == 'y') {
			System.out.println("Additional charge:");
			double additionalCharge = sc.nextDouble();
			list.add(new OutsourcedEmployee(name, hours, valueHour, additionalCharge));	
		}
		else {
			Employee emp = new Employee(name, hours, valueHour);
			list.add(emp);
		}
		}
		System.out.println();
		System.out.println("PAYMENTS");
		for(Employee e : list) {
			System.out.println("name: "+ e.getName() + " - $ - " + String.format("%.2f", e.payment()));
		}
		
		sc.close();
	}
		

}
