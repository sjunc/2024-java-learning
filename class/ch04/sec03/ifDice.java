package ch04.sec03;

import java.util.Scanner;

public class ifDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*6) + 1; // 0~5의 값이기에 1을 더해줌.
		
		if(num == 1) {
			System.out.println("Dice number is 1");
		}else if(num ==2) {
			System.out.println("Dice number is 2");
		}else if(num == 3) {
			System.out.println("Dice number is 3");
		}else if(num == 4) {
			System.out.println("Dice number is 4");
		}else if(num == 5) {
			System.out.println("Dice numer is 5");
		}else{
			System.out.println("Dice number is 6");
		}
		//Switch 문으로 변경
		
		switch(num)
		{
		case 1:
			System.out.println("Dice number 1");
			break;
		case 2:
			System.out.println("Dice number 2");
			break;
		case 3:
			System.out.println("Dice number 3");
			break;
		case 4:
			System.out.println("Dice number 4");
			break;
		case 5:
			System.out.println("Dice number 5");
			break;
		case 6:
			System.out.println("Dice number 6");
			break;
		default:
			System.out.println("error");
		}
		//홀짝 확인
		
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter your Number");
		int input = SC.nextInt();
		if(input%2==0)
		{
			System.out.println("Your Number "+ input + " is even");
		}else
		{
			System.out.println("Your Number "+ input + " is odd");
		}
	}

}
