package chap06.sec01;

public class RepeatCondition2 {

	public static void main(String[] args) {
		
		int max = 10;
		
		for(int i = 0; i<max; i++)
		{
			for(int j = max; j>0; j--)
			{
				if(j<=i) 
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i = max+1; i>0; i--)
		{
			for(int j = max; j>0;j--)
			{
				if(j >= i)
				{
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
