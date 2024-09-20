package ch03.sec03;

public class BitShiftExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int)Math.pow(2, 3);
		System.out.println("result 1 :" + result1);
		System.out.println("result 2: "+ result2);
		
		int num2 = -8;
		int result3 = num2>>3;
		int result4 = num2 / (int)Math.pow(2, 3);	// >> 2비트의 3 이동 이여서 8이 아닌 2의 3승으로 표기
		System.out.println("result3: " +result3);
		System.out.println("result4: " +result4);
		
	}
}
