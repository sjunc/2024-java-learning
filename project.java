package ch01.num1;

public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 =1;
		System.out.println("v1: " +v1);
		if(true) {
			int v2 = 2;
			if(true) {
			int v3 = 2;
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
			System.out.println("v3:" + v3);
		}
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
			//System.out.println("v3: " + v3);
	}
	System.out.println("v1 " + v1);
	}
}
	// System.out.println("v2 " + v2);

	// 오류가 나는 부분은 19번, 22번으로 if문 안에 존재하는 지역변수여서 괄호 밖으로 나오면 에러 
