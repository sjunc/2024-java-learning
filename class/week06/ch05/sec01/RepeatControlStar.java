package chap06.sec01;

public class RepeatControlStar {

	public static void main(String[] args) {
		
		int max = 25;
		for (int i = 0; i < max; i++)
		{
			if(i%2==1)
				System.out.println("");
			System.out.println();
			for(int j = max; j > 0; j--)
			{
					System.out.print("*");
			}
		}

	}
// ���� ���ﰢ�� 25���ε� ���� �� ��� ���� 
}
