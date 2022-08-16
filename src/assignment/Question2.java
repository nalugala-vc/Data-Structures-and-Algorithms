package assignment;
import java.util.Scanner;

public class Question2 {
	
	//recursive method
	public void reverseString(String string)   
	{  
		//checks if the string has any characters
		//base case
	if ((string==null)||(string.length() <= 1))   
		//if the string doesnt have any chracters it outputs the string
	System.out.println(string);   
	else  
	{ 
		//outputs the character of the string at the last index...since indexing starts at 0 then the last index 
		//will be the length of the string -1
		//not using System.out.println(); so that the characters of the word are all on the same line
	System.out.print(string.charAt(string.length()-1));
	   //calls itself again
	reverseString(string.substring(0,string.length()-1));   
	}   
	}   
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inquiring user input
		System.out.println("Please enter any word");
		Scanner scanner=new Scanner(System.in);
		String word=scanner.nextLine();
		
		Question2 question2=new Question2();
		
		int numLetters=word.length();

		question2.reverseString(word);
		
		
		

	}

}
