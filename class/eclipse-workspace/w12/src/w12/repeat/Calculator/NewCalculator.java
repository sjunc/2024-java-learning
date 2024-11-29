package w12.repeat.Calculator;

import java.util.Scanner;

public class NewCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			int[] iArray = scan.nextInt();
			String[] SArray = scan.nextLine();
			int value = 0;
			if(scan.equals("=")) {
				for(int i=0; i<sArray.length; i++)
				{
					switch(i) {
					case "+":
						value = iArray[i] +iArray[i+1];
						continue;
					case "-":
						value = value = iArray[i];
						continue;
					case "*":
						value = value * iArray[i];
						continue;
					case "/":
						value = value / iArray[i];
						continue;
					case "=":
						return value;
						break;
						false;
					}
				}
			}
		}
	}

}
