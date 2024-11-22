package week11.repeat;

import java.util.Scanner;

public class LogicIsImportant {

	public static void main(String[] args) {
		
		
		// 3의 배수가 아닌거 출력한 후 몇 개인지 세기 
		
		int cnt = 0;
		
		for(int i=1; i<=100;i++) {
			if(i%3 != 0) {
				System.out.print(i + " ");
				cnt++;
			}
			
		}
		System.out.println("\ntotal : "+ cnt);
		
		// 이런 걸 클래스로 빼기
		
		MathodLogic.printX(7);
		
		// 4개 입력해서 큰 숫자부터 출력
		
		Scanner SC = new Scanner(System.in);
		
		int iTotCnt = 4;
		int[] arrInputNo = new int[iTotCnt];	// 배열 개수 잡아 선언하는 법
		for(int i=0; i<iTotCnt; i++) {
			arrInputNo[i] = SC.nextInt();
		}
		
		int iTemp = 0;
		
		for(int i=0; i<iTotCnt; i++)
		{
			for(int j=0; j<iTotCnt; j++)
			{
				if(arrInputNo[i]> arrInputNo[j])
				{
					iTemp = arrInputNo[i];
					arrInputNo[i] = arrInputNo[j];
					arrInputNo[j] = iTemp;
				}
			}
		}
		System.out.println("");
	}	
}









