package ch03.sec05;

public class PromotionExample {

	public static void main(String[] args) {
		
		// 자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = 'A';
		intValue = charValue;
		System.out.println("A's unicode: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("LongValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("foaltValue: " + floatValue);
		
		floatValue = 1000.2F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " +doubleValue);

	}
}
