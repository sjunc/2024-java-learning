package chap06.sec01;

import java.util.Scanner;

public class RepeatValue2 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		
		System.out.println("1. Insert 1 ~ 10 value: ");
		int iValue1 = SC.nextInt();
		System.out.println("2. Insert 1 ~ 10 value: ");
		int iValue2 = SC.nextInt();
		System.out.println("3. Insert 1 ~ 10 value: ");
		int iValue3 = SC.nextInt();
		System.out.println("Insert 1 ~ 10 value: ");
		int temp = 0;
		if(iValue2>iValue1 && iValue2>iValue3) {
			temp = iValue1;
			iValue1 = iValue2;
			iValue2 = temp;
			if (iValue3>iValue2) {
				temp = iValue2;
				iValue2 = iValue3;
				iValue3 = temp;
			}
		}else if (iValue3>iValue1 && iValue3>iValue2) {
			temp = iValue1;
			iValue1 = iValue3;
			iValue3 = temp;
			if (iValue3>iValue2) {
				temp = iValue2;
				iValue2 = iValue3;
				iValue3 = temp;
			}
		}else if (iValue3>iValue2) {
			temp = iValue2;
			iValue2 = iValue3;
			iValue3 = temp;
		}
		System.out.println("[First]."+ iValue1 + "[Second]." + iValue2 + "[Third]." + iValue3);
	}
}

// �Է� ���� ���� 3���� �� ����. �Է� ������ ������� ���ؼ�  if���� �Ἥ ���� ū max ������ �ְ� �ӽð��� �ִ� ������� ���� �ٲ�.
// 
// ���� ���� �߰� �ɰڱ� ������ �������� ����. 






