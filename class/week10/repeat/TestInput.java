package week10.repeat;

import java.util.Scanner;

public class TestInput {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		int score = SC.nextInt();
		SC.close();
		
		TestClass testclass = new TestClass();
		testclass.calc(score);
		
		if(score >= 90) {
			System.out.println("A");
		}else if((score < 90)&& (score >= 80)) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else
			System.out.println("F");
	}
	

}
