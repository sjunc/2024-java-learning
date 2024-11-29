package w12.repeat.Calculator;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("First Value: ");
			int iFirst = scan.nextInt();
			scan.nextLine();
			System.out.println();
			
			
			System.out.println("Which calc? please enter *, +,  -, / : ");
			String calc = scan.nextLine();
			System.out.println();
			
			System.out.println("Second Value: ");
			int iSecond = scan.nextInt();
			scan.nextLine();
			System.out.println();
			
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
