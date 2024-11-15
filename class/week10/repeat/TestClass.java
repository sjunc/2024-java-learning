package week10.repeat;


public class TestClass {
	
	
	int score;
	
	void calc(int score) {
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
	




