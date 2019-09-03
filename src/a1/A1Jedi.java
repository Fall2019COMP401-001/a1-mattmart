package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		
		
		// # of items available
				int numOfItems = scan.nextInt();
				String[] itemNames = new String [numOfItems];
				double[] priceOfItems = new double [numOfItems];
				int[] itemsBought = new int [numOfItems];
				int[] customersUsed = new int [numOfItems];
				
				// setting up arrays
				for (int i = 0; i < numOfItems; i++) {
					itemNames[i] = scan.next();
					priceOfItems[i] = scan.nextDouble();
					itemsBought[i] = 0;
					customersUsed[i] = 0;
				}
				
				
				// for loop to account for all customers
				
				int numOfCustomers = scan.nextInt();
						
				for (int a = 0; a < numOfCustomers; a++) {
					
					
				
				// customer first and last name
				
					String fName = scan.next();
					String lName = scan.next();
				
				
					int numOfItemsBought = scan.nextInt();
					int manyCust = 0;
					
					
				
				// for loop for number of items bought for each customer
				
					for (int i = 0; i < numOfItemsBought; i++) {
					
						int numOfItem = scan.nextInt();
						String itemName = scan.next();
						
					
				// for loop to find where item name equals array value
					
						for (int y = 0; y < numOfItems; y++) {
							if (itemName.equals(itemNames[y])) {
								itemsBought[y] += numOfItem;
								manyCust += numOfItem;
								customersUsed[y]++;
							} else {
								
							}
						
						}
						
					}
					
					
				}
				
				for (int y = 0; y < numOfItems; y++) {
					if (customersUsed[y] == 0) {
						System.out.println("No customers bought Apple");
						} else {
							System.out.println(customersUsed[y] + " customers bought " + itemsBought[y] + " " + itemNames[y]);
						}
				}
				
				scan.close();
				
	}
}
