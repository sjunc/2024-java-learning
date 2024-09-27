package ch04.sec04;

public class SumForm1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i;
		
		for(i=1; i<=100;i++) {
			sum += 1;
		}
		
		for (int m = 2; m <= 9; m++) {
			System.out.println("***" + m +" 단 ***");
			for(int n = 1;n<=9;n++) {
				System.out.println(m+ " X " + n + " = " + (m*n));
			}
		}
		
		// 7단 제외 구구단
		for (int m = 1; m<=9; m++) {
			System.out.println("***"+ m + " 단***" );
			if(m != 7) {
				for(int n = 1; n <=9; n++) {
					System.out.println(m + " X " + n + " = "+ m*n);
				}
			}
		}
		// * 산
		for(int j = 1; j<=10; j++) {
			for(int k = 1; k<=j; k++)
				System.out.printf("*");
			System.out.println("");
		}
		// * 역 발산
		for(int j = 0;j < 10;j++) {
			for(int k = 10; k > 0; k--)
			{
				if(k <= j)
					System.out.printf(" ");
				else
				System.out.printf("S");
			}System.out.println("");
		}
	}

}
