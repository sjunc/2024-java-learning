package ch03.sec08;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//숫자연산
		int result1 = 10 + 2 + 8;
		System.out.println("result1: "+ result1);
		
		//결합연산
		
		String result2 = 10 + 2 + "8"; // 숫자가 문자보다 먼저나와서 숫자연산후 뒤의 문자와 결합연산함.
		System.out.println("result2: "+ result2);
		
		String result3 = 10 + "2" + 8;
		System.out.println("result3: " + result3);
		
		String result4 = "10" + 2 + 8;  // 앞에서 문자가 나왔기에 순서대로 102 1028 이 됨. 결합연산으로 인식.
		System.out.println("result4: " + result4);
		
		String result5 = "10" + (2 + 8);
		System.out.println("result5: " + result5);

	}

}
