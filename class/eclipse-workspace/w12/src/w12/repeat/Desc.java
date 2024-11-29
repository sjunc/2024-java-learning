package w12.repeat;

import java.util.Scanner;

public class Desc {
	
	
	// distribution 배포 
	static void desc(int iSize, String sortWay) {							// main 이 static이므로 메소드도 static으로 만들어 줘야함. 
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] arrInput = new int[iSize];
		int iTemp = 0;
		
		for(int i=0; i<iSize; i++) {
			arrInput[i] = scan.nextInt();
		}
		
		if(sortWay == "desc") {
			for(int i=0; i<iSize; i++) {
				for(int j=0; j<iSize; j++) {
					if(arrInput[i]>arrInput[j]) {
						iTemp = arrInput[i];
						arrInput[i] = arrInput[j];
						arrInput[j] = iTemp;
					}
				}
			}
		}
		if(sortWay == "asc") {
			for(int i=0; i<iSize; i++) {
				for(int j=0; j<iSize; j++) {
					if(arrInput[i]<arrInput[j]) {
						iTemp = arrInput[i];
						arrInput[i] = arrInput[j];
						arrInput[j] = iTemp;
					}
				}
			}
		}
		scan.close();
		for(int k=0; k<iSize; k++ ) {
			System.out.print(arrInput[k] + " ");
		}
	}
	int[] SetSortNo(int iSize) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<iSize; i++) {
			int arrInputNo[i] = scan.nextInt();
		}
		int iTemp;
		for(int i=0; i<iSize; i++) {
			for(int j=0; j<iSize; j++) {
				if(arrInputNo[i]<arrInputNo[j]) {
					iTemp = arrInputNo[i];
					arrInputNo[i] = arrInputNo[j];
					arrInputNo[j] = iTemp;
				}
			}
		}
		return arrInputNo;
	}
}
