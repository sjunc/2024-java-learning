package week10.repeat;

public class RandamMain {

	public static void main(String[] args) {
		
		
		int[] randArray = new int[10];
		int maxVal = 0;
		int minVal = randArray[0];
		int tempVal = 0;
		
		for(int i=0; i<10; i++)
		{
			int rand = (int)(Math.random()*10) +1;
			randArray[i] = rand;
			if(minVal == 0)
			{
				minVal = randArray[0];
			}
			tempVal = randArray[i];
			if(tempVal > maxVal)
				maxVal = tempVal;
			if(tempVal < minVal)
				minVal = tempVal;
		}
		
		System.out.println("MaxVal = "+maxVal);
		System.out.println("MinVal = "+minVal);

		for(int j=0; j <10; j++)
		{
			System.out.print(randArray[j] + " ");
		}

	}

}
