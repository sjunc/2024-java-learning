package week11.repeat;

import java.util.Scanner;

public class Desc {
	int[] SetSortNo(int[] arrInput)
	{		
		int iTotCnt = 4;
		int[] arrInputNo = new int[iTotCnt];	// 배열 개수 잡아 선언하는 법
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
