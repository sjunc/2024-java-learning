package week09;

public class RepeatMiddle {

	public static void main(String[] args) {
		int iStar = 5;
		for(int i = 0; i<iStar; i++)
		{
			for(int j=iStar; j>0; j--)
			{
				if(j<=i)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.println("");
		}

	}

}
