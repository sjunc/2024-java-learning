package ch03.sec7;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20; // 컴파일 단계에서 연산
		System.out.println("result: " + result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;		//int 타입으로 변환 후 연산
		System.out.println("result: " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5; //long 타입으로 변환 후 연산
		System.out.println("result3: " + result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7; //int타입으로 변환 후 연산
		System.out.println("reult4: " + result4);
		System.out.println("reult4: " + (char)result4);
		
		int v8 = 10;
		int result5 =v8 /4;
		System.out.println("result5: " + result5);

	}

}
