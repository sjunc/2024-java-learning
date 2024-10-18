package week07.ch06.Refeat;

public class CalcNumberTest {

	public static void main(String[] args) {
		// 지난 주 복습
		 int iVal1 = 3;
		 int iVal2 = 7;
		 int iVal3 = 9;
		 int iVal4 = 5;
		 int iRslt = iVal1++ * ++iVal2 + ++iVal1/iVal4-- + iVal3%3 ;
		
		 System.out.printf("%d", iRslt);

	}// 시험 나옴 21 이 아니라 25임. 24 -> 계산이 끝나서 1번이 4가 됨. -> 5/5 즉 1을 더함. 이후 4번은 4가 되었을 것임. iVal3%3은 0임. 그럼 25임.
	// 당연한 말이지만 계산은 앞에서 부터 하는 것
	// static 메모리에 바로 가져다 쓰는 것
	// 시험은 오픈 북
}	// 인자 개수는 통제하는 방식으로 코딩하는 게 오류를 줄이기 위한 방법. (가변길이 매개변수 추천 X) 값을 계속 받는 것은  loop로 처리
