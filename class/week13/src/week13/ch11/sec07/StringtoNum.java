package week13.ch11.sec07;

import java.util.Scanner;

public class StringtoNum {
	public static void strToNum(int number) throws NumException{
		if(number > 9) {
			throw new NumException("it's over" + (number));
		}
	}
	
	public static void main(String[] args) {
		
		String[] stringArray;
		Integer[] IntegerArray;
	
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<=stringArray.length; i++) {
			try {
				String value = scanner.nextLine();
				int number = Integer.parseInt(value);
				System.out.println("array["+ i+ "]: "+ value);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index over : " + e.getMessage());
			}catch(NumberFormatException e) {
				System.out.println("It's not a number" + e.getMessage());
			}catch(Exception e) {
				System.out.println(" you have a problem . ");// 상위 클래스는 아래쪽으로  (예외가 밑으로 갈수록 넓은 범위의 오류(예외)임 위에 있으면 무슨 문제인지 모름. 
			}
		}
	}
}
