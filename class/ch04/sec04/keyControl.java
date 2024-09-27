package ch04.sec04;

import java.util.Scanner;

public class keyControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1. Speed up | 2. Speed down| 3. Stop");
			System.out.println("-----------------------------------");
			System.out.print("Choose:    ");
			
			String strNum = SC.nextLine();
			if(strNum.equals("1")) {
				speed++;
				System.out.println("Current Speed =" + speed);
			}else if (strNum.equals("2")) {
				speed--;
				System.out.println("Current Speed =" + speed);
			}else if (strNum.equals("3")) {
				run = false;
			}
		}
		System.out.println(" program down ");

	}

}
