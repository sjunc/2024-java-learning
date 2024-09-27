package ch04.sec03;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 75;
		
		if(score>=90) {
			System.out.println("A");
			System.out.println("Score is higher than 90");
		}else if(score>=80) {
			System.out.println("Score is higher than 80 lower than 90");
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("Score is higher than 70 lower than 80");
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("Score is higher than 60 lower than 70");
			System.out.println("D");
		}else{
			System.out.println("Score is lower than 60");
			System.out.println("F");
		}

	}

}
