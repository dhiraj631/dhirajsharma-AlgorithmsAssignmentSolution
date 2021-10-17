
package com.greatlearning.main;
import java.util.Scanner;

public class Stockers {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args)
	{
		System.out.println("Enter the number of companies:");
		int N = sc.nextInt();
		double[] stocker = new double[N];
		boolean[] stockvalue = new boolean[N];
		int countT = 0;
		int countF = 0;
		int last = stocker.length - 1;
		double[] stocker1 = new double[N];
		
		
		for (int i = 0; i < N ; i++) {
		 System.out.println("Enter the stock price of company " + (i + 1) );
		 stocker[i] = sc.nextDouble();
		 stocker1[i] = stocker[i];
		 System.out.println("Whether companies stock price rose today compared to yesterday ? ");
		 stockvalue[i] = sc.nextBoolean();
		
		    if (stockvalue[i] == true) {	
		    	countT = countT + 1;
		    }	
		    else if (stockvalue[i] == false) {	
		    	countF = countF + 1;
		    }
		 
		}
		
		int choice;
		
		
		do {
			
		System.out.println("--------------------------------------------------");  	
		System.out.println( "1. Display the stock ptice in ascending order" );
		System.out.println( "2. Display the stock ptice in descending order" );
		System.out.println( "3. Display the total number of companies for which stock price rose today: " );
		System.out.println( "4. Display the total number of companies for which stock price decline today:" );
		System.out.println( "5. Search a specific stock price " );
		System.out.println( "6.  Press 0 to exit ");
		System.out.println("--------------------------------------------------");
		
		
		
		choice = sc.nextInt();
	
		MergeSortImplementation ms = new MergeSortImplementation();
		MergeSortImplementationAscending msa = new MergeSortImplementationAscending();
		BinarySearch bs = new BinarySearch();
		
		
		switch( choice ) {
			case 1:
				msa.sort(stocker1, 0, stocker1.length - 1);
				for (int i = 0 ; i < N ; i++) {
				   System.out.println(stocker1[i]);
				}
				break;
			case 2:
			    ms.sort(stocker1, 0, stocker1.length - 1);
				for (int i = 0 ; i < N ; i++) {
				   System.out.println(stocker1[i]);
				} 
				break;
			case 3:
				System.out.println("Total number of companies whose stock price rose today : " + countT);
				break;
			case 4:
				System.out.println("Total number of companies whose stock price decline today : " + countF);
				break;
			case 5:
				System.out.println("Enter the key value you want to search");
				double key = sc.nextDouble();
				msa.sort(stocker1, 0, stocker1.length - 1);
				//int last = stocker.length - 1;
				bs.binarySearch(stocker1, 0, last, key);
				break;
			case 0:
				System.out.println("Exited successfully");
				choice = 0;
				
				break;
			default:
				System.out.println( "Incorrect choice" );
				return;
		}
			
		}while (choice != 0);
		
		
	}
	
	

}
