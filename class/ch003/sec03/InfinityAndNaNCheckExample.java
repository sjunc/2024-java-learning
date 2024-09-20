package ch03.sec03;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x/y;
		//double z = x % y;
		
		// 잘못된 코드
		System.out.println(z+2);
		
		//알맞은 코드
		if(Double.isInfinite(z)||Double.isNaN(z)) {
			System.out.println("Can't answer ");
		}else
			System.out.println(z + 2);


	}

}
