package chap06.sec01;

public class RepeatConditon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("gugudan");
		
		for(int i = 2; i<=9; i++)
		{
			if(i!=6) {
			System.out.println( i + "dan");
			for(int j = 1; j<10; j++)
			{
				System.out.println(i + "X" + j + "=" + i*j);
			}
		}
	}
}
}
