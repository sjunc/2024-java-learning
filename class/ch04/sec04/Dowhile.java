package ch04.sec04;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the message");
		System.out.println("Press Q to terminate program ");
		
		Scanner SC = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = SC.nextLine();
			System.out.println(inputString);
		}while(! inputString.equals("q") );
		
		System.out.println();
		System.out.println("program over");

	}

}
