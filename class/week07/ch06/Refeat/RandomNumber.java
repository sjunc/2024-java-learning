package week07.ch06.Refeat;

public class RandomNumber {

	public static void main(String[] args) {
		// ������ ���������� �ƴϸ� ���� �ۼ��ϰ� �ʿ��� ������ ���� �ö�ͼ� ��. 
		
		

		int[] arRandom = new int[10];
		for(int i = 0; i< 10; i++)
		{
			arRandom[i] = (int)(Math.random()*10)+1;
		}
		System.out.println(arRandom);
	}// sorting ����� ���� �ٸ�. 

}
