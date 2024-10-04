package ch05.sec03;

public class SplitExample {

	public static void main(String[] args) {
		String board = "1, java education, String is String, david ";
		
		// 문자열 분리
		String[] tokens = board.split(", ");
		
		System.out.println("number : " + tokens[0]);
		System.out.println("subject : " + tokens[1]);
		System.out.println("sodyd : " + tokens[2]);
		System.out.println("name : " + tokens[3]);
		System.out.println();
		
		
		//for 문을 이용한 읽기
		
		for(int i = 0; i < tokens.length;i++) {
			System.out.println(tokens[i]);
		}
		
		
		// String 연습문제 
		String sTot = "10Point, 23Point, 33Point, 45Point, 55Point, 67Point";
		String[] sPoints = sTot.split("Point, ");
		
		int totCnt = sPoints.length;
		int sumValue = 0;
		float averageF = 0f;
		
		System.out.println("TotCnt : "+ totCnt );
		System.out.println("sumValue : " + sumValue);
		System.out.println("Average : " + averageF);
		
		for(int i = 0; i< totCnt; i++ ) {
			sumValue += Integer.parseInt(sPoints[i].replace("Point", "")) ;
		}
		averageF = (float)sumValue / (float)totCnt;
		
		System.out.println("TotCnt : "+ totCnt );
		System.out.println("sumValue : " + sumValue);
		System.out.println("Average : " + averageF);
		//System.out.printf("Average : %10.2f \n" + averageF);
	}
	
	//String 연습문제 2  과목별 합과 평균 구하기. 
	
	String sStudent1 = "math: 85, calc: 93, science: 71";
	String sStudent2 = "calc: 71, math: 88, science: 92";
	

}
