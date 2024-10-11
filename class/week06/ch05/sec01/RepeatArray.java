package chap06.sec01;

public class RepeatArray {

	public static void main(String[] args) {
		// 중복 되지 않게 배열에 등록하기 
		
		int[] randArray = new int[10];
		for(int i =0; i <10; i++)
		{
			randArray[i] = (int)(Math.random()*10) + 1;
		}
		System.out.println();
	}
// 역삼각형 별 출력
// 과제 + 오름차순 정렬 출력 코딩 (서핑) 
}
