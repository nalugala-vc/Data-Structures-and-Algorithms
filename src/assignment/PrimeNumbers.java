package assignment;

import java.util.Scanner;

public class PrimeNumbers {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initializing n to 3
		int n=3;
		
		//inquiring user input to check if it is prime
		System.out.println("Please enter the number P");
		Scanner scanner=new Scanner(System.in);
		//storing the user input in variable P
		int P=scanner.nextInt();
		
		if (P==7 || P==5||P==3) {
			//since the square root of 3 5 and 7 are smaller than 3 yet they are prime 
			//numbers we check specifically for these numbers
			System.out.println("This is prime");
		}
		
		//checking if the number is odd
		if((P%2)!=0) {
			
			//finding the square root of the number P
			double sqP=Math.pow(P, 0.5);
			
			//Runs the loop until n is less than or equal to the squareroot of P
			while(n<=sqP) {
				if(P%n==0) {
					System.out.println("This is not prime");
					System.exit(0);
				}
				else {
					System.out.println("This is prime");
					System.exit(0);
				}
				
			n++;	
			}
		}
		else {
			System.out.println("This is not a prime number");
		}

	}

}
