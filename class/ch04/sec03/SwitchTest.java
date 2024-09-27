package ch04.sec03;

public class SwitchTest {

	public static void main(String[] args) {
		int month = (int)(Math.random()*12) + 1;
		switch(month) {
			case 1, 3, 5, 7, 8, 10, 12 ->{
				System.out.println("last day is 31");
				break;
			}case 2 ->{
				System.out.println("last day is 28");
				break;
			}case 4, 6, 9, 11 ->{
				 System.out.println("last day is 30");
				 break;
			 }
		}
	}

}
