package ch04.sec03;

import java.util.Scanner;

public class review 
{

	public static void main(String[] args) 
	{	// 괄호 햇갈리지 않게 내려서 씀.  
		
		int appleTot = 123;
		int basketMax = 10;
		
		int restApple = appleTot%basketMax;
		int basket = appleTot / basketMax;
		
		if(restApple>0) {
			basket++;
		}
		
		System.out.println("basket" + basket + " need "); //%d와 , 변수
		
		// 내 방식의 코딩
		Scanner scanner = new Scanner(System.in); //스케너는 임포트 필요. 
		
		System.out.println("1. Input Integer value :");
		String sFstVal = scanner.nextLine();
		System.out.println("2. Input Integer value :");
		String sSecVal = scanner.nextLine();
		
		int iFstVal = Integer.parseInt(sFstVal); // 바로 int iFstval =scanner.nextInt();
		int iSecVal = Integer.parseInt(sSecVal);
		System.out.println("Input iFstval = " + iFstVal);
		System.out.println("Input iSecVal = "+ iSecVal);
		
		if(iFstVal>iSecVal) {
			System.out.println("Output iFstval = " + iFstVal);
			System.out.println("Output iSecVal = "+ iSecVal);
		}else {
			System.out.println("Output iSecval = " + iSecVal);
			System.out.println("Output iFstVal = "+ iFstVal);
		}
		// 플로우차트를 머리속에 그릴 수 있어야함. 
				Scanner SC = new Scanner(System.in);
				
				System.out.println("1. Input Integer value :");
				int iFstValue = SC.nextInt();
				System.out.println("2. Input Integer value :");
				int iSecValue = SC.nextInt();
				
				System.out.println("Input iFstval = " + iFstValue);
				System.out.println("Input iSecVal = "+ iSecValue);
				
				if(iFstValue<iSecValue) // 조건을 잘 확인 
				{
					int iTempVal = iFstValue;
					iFstValue = iSecValue;
					iSecValue = iTempVal;
					
				} // 변수 서로 값을 바꾸는 방법을 첫번 째 시간에 배웠는데 그걸 활용하면 굳이 두번 출력문을 작성하지 않아도 됨. else 문 없이 조건문으로 해결가능
				System.out.println("Output iFstval = " + iFstValue);
				System.out.println("Output iSecVal = "+ iSecValue);
	}

}
