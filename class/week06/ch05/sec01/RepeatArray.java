package chap06.sec01;

public class RepeatArray {

	public static void main(String[] args) {
		// �ߺ� ���� �ʰ� �迭�� ����ϱ� 
		
		int[] randArray = new int[10];
		for(int i =0; i <10; i++)
		{
			randArray[i] = (int)(Math.random()*10) + 1;
		}
		System.out.println();
	}
// ���ﰢ�� �� ���
// ���� + �������� ���� ��� �ڵ� (����) 
}
