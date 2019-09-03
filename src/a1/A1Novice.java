package a1;

import java.util.Scanner;


public class A1Novice {
	

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// # of customers
		int numberOfCustomers = scan.nextInt();
		int a = 0;
		
		while (a < numberOfCustomers) {
			// initial
			String firstName = scan.next();
			char firstI = firstName.charAt(0);
			
		
			// last name
			String lastName = scan.next();
			
		
			// sum of customer
			int items = scan.nextInt();
			double sum = 0;
			for (int i = 0; i < items; i++) {
			
				double b = scan.nextDouble();
				scan.next();
				double c = scan.nextDouble();
				double total = (b * c);
				sum += total;
				//System.out.println("money: " + sum);
			}
			
	
		
			System.out.println(firstI + ". " + lastName + ": "+ String.format("%.2f", sum));
		
			a++; 
		}
		
		scan.close();
		
		
	}
}
