package week07.ch06.Refeat;

public class CalcNumberTest {

	public static void main(String[] args) {
		// ���� �� ����
		 int iVal1 = 3;
		 int iVal2 = 7;
		 int iVal3 = 9;
		 int iVal4 = 5;
		 int iRslt = iVal1++ * ++iVal2 + ++iVal1/iVal4-- + iVal3%3 ;
		
		 System.out.printf("%d", iRslt);

	}// ���� ���� 21 �� �ƴ϶� 25��. 24 -> ����� ������ 1���� 4�� ��. -> 5/5 �� 1�� ����. ���� 4���� 4�� �Ǿ��� ����. iVal3%3�� 0��. �׷� 25��.
	// �翬�� �������� ����� �տ��� ���� �ϴ� ��
	// static �޸𸮿� �ٷ� ������ ���� ��
	// ������ ���� ��
}	// ���� ������ �����ϴ� ������� �ڵ��ϴ� �� ������ ���̱� ���� ���. (�������� �Ű����� ��õ X) ���� ��� �޴� ����  loop�� ó��
