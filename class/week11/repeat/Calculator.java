package week11.repeat;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// 계산기 만들기 과제
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			System.out.println("First Value: ");
			int iFirst = scan.nextInt();
			System.out.println("Which calc? please enter *, +,  -, / : ");
			String calc = scan.nextLine();
			
			
			int iSecond = scan.nextInt();
			System.out.println("Second Value: ");
			
			switch(calc){
				case "*":
					System.out.println(iFirst*iSecond);
					continue;
				case "/":
					System.out.println(iFirst/iSecond);
					continue;
				case "+":
					System.out.println(iFirst+iSecond);
					continue;
				case "-":
					System.out.println(iFirst-iSecond);
					continue;
				case "q":
					System.out.println("Stop !!!");
					break;
		
			}
		}
	}
}
