package codes.java.programs;

import java.util.Scanner;

public class ReverseIt {
	
	//Variables
	String userString, revString=""; 
	int userNum, revNum=0, userChoice;
	
	//User Input
	public void userChoice() {
		System.out.println("What do you want to reverse?");
		System.out.println(" 1 for String: \n 2 for Number: \n 3 to \"Perform later\"");
		Scanner in = new Scanner(System.in);
		userChoice = in.nextInt();
	}
	
	//String Reverse
	public void reverseString() {
		System.out.println("Your choice is : " + userChoice);
		System.out.println("Enter the string to reverse: ");
		Scanner in = new Scanner(System.in);
		userString = in.nextLine();
		System.out.println("Original String is: " + userString);
		
		for(int r=userString.length()-1; r>=0; r--) {
			revString = revString + userString.charAt(r);
		}
		System.out.println("String in Reverse Order: " +revString);
	}
	
	//Number Reverse
	public void reverseNumber() {
		System.out.println("Your choice is : " + userChoice);
		System.out.println("Enter number to reverse: ");
		Scanner in = new Scanner(System.in);
		userNum = in.nextInt();
		
		int lastDigit;
		while(userNum>0) {
			lastDigit = userNum % 10;
			userNum = userNum / 10;
			revNum = revNum*10 + lastDigit;
		}
		System.out.println("Number in Reverse Order: " + revNum);
		
		//userChoice();
		
	}

	public static void main(String[] args) {
		
		ReverseIt oRev = new ReverseIt();
		oRev.userChoice();
		
		switch (oRev.userChoice) {
			
		case 1: oRev.reverseString();
		break;
		
		case 2: oRev.reverseNumber();
		break;
		
		case 3: 
			System.out.println("Exit!");
			break;
		
		default :
			System.out.println("Something went wrong!!");
		}
		
	}

}
