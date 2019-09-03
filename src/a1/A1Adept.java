package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Your code follows here.
		
		double averageNum = 0;
		double avgNum = 0;

		double prevNum = 0;
		double prevNum2 = 999999999; 
		
		double maxNum = 0;
		String maxFName = "";
		String maxLName = "";
		
		double smallNum = 0;
		String smallFName = "";
		String smallLName = "";
		
		// # of items available
		int numOfItems = scan.nextInt();
		String[] itemNames = new String [numOfItems];
		double[] priceOfItems = new double [numOfItems];
		
		// setting up arrays
		for (int i = 0; i < numOfItems; i++) {
			itemNames[i] = scan.next();
			priceOfItems[i] = scan.nextDouble();
		}
		
		
		// for loop to account for all customers
		
		int numOfCustomers = scan.nextInt();
				
		for (int a = 0; a < numOfCustomers; a++) {
			
			
		
		// customer first and last name
		
			String fName = scan.next();
			String lName = scan.next();
		
		
			int numOfItemsBought = scan.nextInt();
			double sumOfPayment = 0;
			double tempAvgNum = 0;
			double avgden = 0;
			
		
		// for loop for number of items bought for each customer
		
			for (int i = 0; i < numOfItemsBought; i++) {
			
				int numOfItem = scan.nextInt();
				String itemName = scan.next();
			
		// for loop to find where item name equals array value
			
				for (int y = 0; y < numOfItems; y++) {
					if (itemName.equals(itemNames[y])) {
					double sum = numOfItem * priceOfItems[y];
					sumOfPayment += sum;
					
					}
				}
				
			}
			averageNum += sumOfPayment;

			// if statement for Biggest
			if (sumOfPayment > prevNum) {
				maxNum = sumOfPayment;
				maxFName = fName;
				maxLName = lName;
				prevNum = sumOfPayment;
			}
			
			// if statement for Smallest
			if (sumOfPayment < prevNum2) {
				smallNum = sumOfPayment;
				smallFName = fName;
				smallLName = lName;
				prevNum2 = sumOfPayment;
			}
			
			avgNum = averageNum / numOfCustomers;
			// System.out.println(fName + " " + lName +  " (" + String.format("%.2f",maxNum) + ")");
		}
		System.out.println("Biggest: " + maxFName + " " + maxLName +  " (" + String.format("%.2f",maxNum) + ")");
		System.out.println("Smallest: " + smallFName + " " + smallLName +  " (" + String.format("%.2f",smallNum) + ")");
		System.out.println("average: " + String.format("%.2f", avgNum));
			
		scan.close();
		
	}
}
