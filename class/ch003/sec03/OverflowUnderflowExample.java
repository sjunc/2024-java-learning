package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125;
		for(int i = 0; i<5;i++) {
			var1++;
			System.out.println("var1: "+ var1); // 125 126 127 그 다음에 오버플로우 126
		}
		
		System.out.println("--------------------------");
		
		byte var2 = -125;
		for(int i = 0; i <5; i++) {
			var2--;
			System.out.println("var2: "+ var2); // -125 -126 -127 -128 그다음에 언더플로우 -126 
		}

	}

}
// 둘 다 줄거나 감소하고 시작