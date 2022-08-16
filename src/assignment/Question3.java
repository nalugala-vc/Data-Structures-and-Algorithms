package assignment;

import java.util.Scanner;

public class Question3 {
	/*Write Java program based on recursion that will count up numbers from one value lowest to another 
value highest.*/

	
	//the recursive function which takes data type integer as the argument
	public void countdown(int num) {
		//base case=> if the number has reached 0
		if(num==0) {
			//print out the number 0
			System.out.println(num);
			//then give the message 'countdown ended'
		    System.out.println("Countdown Ended!!");
		}
		else {
			//if not print the number
			System.out.println(num);
			//then decrement the number by 1
			countdown(num-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//prompting the user to enter the number to be counted down from
		System.out.println("Please enter a number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		//initializing the class
		Question3 question3=new Question3();
		//calling the recursive function
		question3.countdown(num);

	}

}
