package ch05.sec04;

public class ArrayCreateByNewExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 연습문제 길이가 10인 배열을 선언하고 임의의 수 1~10까지를 생성해 배열에 등록하고 7이 몇 번째 값인지 구하는 소스를 구현하시오. 
		int[] tenArray =new int[10];
		
		
		for(int i = 0; i<tenArray.length; i++) {
			tenArray[i] = (int)(Math.random()*10)+1;
			System.out.printf(tenArray[i] + " ");
		}
		
	}

}
