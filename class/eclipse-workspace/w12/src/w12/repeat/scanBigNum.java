package w12.repeat;

import java.util.Scanner;

public class scanBigNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("4 integer in and DESC OUT");
	
		int iSize = 4;
		int[] arrInput = new int[iSize];
		int iTemp = 0;
		
		for(int i=0; i<iSize; i++) {
			arrInput[i] = scan.nextInt();
		}
		for(int i=0; i<iSize; i++) {
			for(int j=0; j<iSize; j++) {
				if(arrInput[i]>arrInput[j]) {
					iTemp = arrInput[i];
					arrInput[i] = arrInput[j];
					arrInput[j] = iTemp;
				}
			}
		}
		for(int k=0; k<iSize; k++ ) {
			System.out.print(arrInput[k] + " ");
		}
		System.out.println();
		
		// 2��° main���� �޼ҵ� ����.  
		
		Desc.desc(5, "asc");
		
		// 3��° class ���� ���� 
		
}		
}		

