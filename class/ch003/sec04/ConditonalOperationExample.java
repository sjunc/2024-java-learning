package ch03.sec04;

public class ConditonalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char grade = (score>90)?'A': ((score > 80) ? 'B': 'C');
		System.out.println(score + " score is " + grade + " grade.");
		
		int num = -11;
		String result = (num > 0)? "positive": ((num < 0) ? "negative": "0");
		System.out.println(num + " num is " + result + " number");

	}

}
