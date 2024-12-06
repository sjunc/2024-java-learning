package week13.ch11.sec02;

import java.text.NumberFormat;

public class ExceptionHandingException {
	public static void main(String[] args) {
		String[] array = {"100","1oo", null, "200"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+ i+ "]: "+ value);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index over : " + e.getMessage());
			}catch(NumberFormatException e) {
				System.out.println("Cannot mutant to number" + e.getMessage());
			}catch(NullPointerException|NumberFormatException e) {
				System.out.println("data problem: " + e.getMessage());
			}catch(Exception e) {
				System.out.println(" you have a problem . ");// 상위 클래스는 아래쪽으로  (예외가 밑으로 갈수록 넓은 범위의 오류(예외)임 위에 있으면 무슨 문제인지 모름. 
			}
		}
	}

}
