package ch04.sec04;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1;
		while( i<= 10) {
			System.out.printf(i + " ");
			i++;
		}
		
		i = 1;
		int sum = 0;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1 ~ "+ (i-1) + " Sum :" + sum);
	}

}
