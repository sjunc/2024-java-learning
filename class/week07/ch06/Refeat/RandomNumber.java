package week07.ch06.Refeat;

public class RandomNumber {

	public static void main(String[] args) {
		// 변수는 지역변수가 아니면 위에 작성하고 필요할 때마다 위로 올라와서 씀. 
		
		

		int[] arRandom = new int[10];
		for(int i = 0; i< 10; i++)
		{
			arRandom[i] = (int)(Math.random()*10)+1;
		}
		System.out.println(arRandom);
	}// sorting 방법에 따라 다름. 

}
