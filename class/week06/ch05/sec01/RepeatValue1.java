package chap06.sec01;

public class RepeatValue1 {

	public static void main(String[] args) {
		
		int iValue1 = 5;
		int iValue2 = 8;
		
		int iTemp = 0;
		
		System.out.println("1. iValue1: " + iValue1);
		System.out.println("1. iValue2: " + iValue2);
		System.out.println("Change Value ----------------------------------");
		iTemp = iValue1;
		iValue1 = iValue2;
		iValue2 = iTemp;
		System.out.println("2. iValue1: " + iValue1);
		System.out.println("2. iValue2: " + iValue2);
		

	}

}
