package chap06.sec01;

public class RepeatCalc {

	public static void main(String[] args) {
		// 9.5�� �̸� ����			���� 9 ����. int���� �Ҽ����� �������Ѵ�. 
		
		int iValue1 = 5;
		int iValue2 = 8;
		int iValue3 = 3;
		int iRsltVal = (iValue1++) + (++iValue2)%(--iValue3)/2+4;
		
		System.out.println(iRsltVal);
	
	int iBoxLimit = 12;
	int iTotBox = 100;				//iTotBoxCnt
	int iDayApple = 573;
	int iRestBox = 0;
	int iUsedBox = 0;
	
	iUsedBox = iDayApple/iBoxLimit;
	if(iDayApple%iBoxLimit > 0)
		iUsedBox++;
	iRestBox = iTotBox - iUsedBox;
	System.out.println("rest box is "+ iRestBox);
	}
}
