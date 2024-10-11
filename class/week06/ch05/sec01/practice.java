package chap06.sec01;

public class practice {

	public static void main(String[] args) {
		int[] randArray = new int[10];
		for(int i=0; i<10; i++) {
			randArray[i] =(int)(Math.random()*10) + 1;
			System.out.printf("%d ", randArray[i]);
			if(randArray[i]== 7) {
				System.out.println("\n7 is " + (i + 1) +"th number");
			}
		}
	}
}
