package ch03.sec02;

public class Apple123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int apple = 123;
		int howMany = 10;
		int basket;
		if(apple % howMany == 0) {
			basket =apple / howMany;
		}else {
			basket = apple/ howMany + 1;
		}
		System.out.println("We need  " + basket + " basket");
		
		// 사과는 123개이고 바구니 용량은 10개니까 123에다가 10을 나누면 되겠지? 그럼 3개 사과가 남는다. 그럼 나머지를 이용해서 하나 늘리자.
		
		int iAppleToCnt = 123;
		int iBundle = 10;
		
		int iTotUsedBundle = iAppleToCnt / iBundle;
		int iLeftApple = iAppleToCnt % iBundle;
		
		System.out.println("1. Cnt" + iTotUsedBundle);
		System.out.println("2. Cnt : " + iLeftApple);
		
		if(iLeftApple >0)
			iTotUsedBundle++;
		
		
		System.out.println("Result: "+ iTotUsedBundle);
		
		// 사과 개수는 123개이고 한도는 10, 내가 사용한 총 개수는 apple/bundle, 남은 사과는 나머지. 나머지가 양수면 증감. 
		
		
		// 차이점 1. 변수 사용 개수	가독성을 늘린다. 다른 사람이 보거나 오래된 코드여도 쉽게 이게 뭔 내용인지 파악 가능하다. 코드 효율이 올라간다. 변수 값만 변경해주면 된다.  
		
		// 차이점 2. 중간에 프린트를 찍음.(오류 확인)
		
		// 차이점 3. if 문 하나와 증감 사용. 	가독성의 일환, 비트 단위 연산으로 더 빠른 연산.
		
		// 차이점 4. 변수 이름 지을 때 자료형 한 글자 앞에 붙인 후에 카멜 케이스 
		
		// Tot 는 Total의 약자

	}

}
