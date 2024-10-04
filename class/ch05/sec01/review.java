package ch05.sec01;

import java.util.Scanner;

public class review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*20) + 1;
		
		Scanner SC = new Scanner(System.in);
		
		int count = 0;
		
		boolean working = true;
		while(working) {
			System.out.println("Input a number between 1 and 20");
			String sUserNum = SC.nextLine();
			int iUserNum = (Integer.parseInt(sUserNum));
			// 한줄로 int input = Integer.parseInt(SC.nextLine());
			count++;
			if(num == iUserNum) {
				working = false;
				System.out.println("bingo!");
				System.out.println("You passed the Quiz, "+count+ "th try....");
			}else if(num > iUserNum) {
				System.out.println("UP!");
			}else if(num < iUserNum) {
				System.out.println("Down!");
			}// else 한후 Bingo 하고 break 구문해서 탏출  순서도 작을 때, 클 때 같을 때로 작성
				
		}
		// System.out.println("You passed the Quiz, %d th try....", count);

	}

}
