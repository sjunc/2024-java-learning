package week11.repeat;

public class MathodLogic {
	
	
	static void printX(int num) {
		for(int i=1; i <=100; i++) {
			if( (i%num)  == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
