package ch04.sec04;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randNum = (int)(Math.random()*10) + 1;
		
		Scanner SC = new Scanner(System.in);
		
		int tryed = 0;
		while(tryed<4) {
			int userNum = SC.nextInt();
			if(userNum > randNum)
				System.out.println("DOWN");
			else if(userNum < randNum)
				System.out.println("UP");
			else {
				System.out.println("Bingo");
			}tryed++;
		}

	}

}
