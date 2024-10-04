package ch05.sec03;

public class CharAtExam {

	public static void main(String[] args) {
		String ssn = "0106241230123";		// 주민번호 010424 - 3XXXXXX
		char sex = ssn.charAt(6);
		switch(sex) {
		case '1':
		case '3':
			System.out.println(" man ");
			break;
		case '2':
		case '4':
			System.out.println(" Woman");
			break;
		}
		
		String str = "CharAtExample Test1";
		String s1 = str.substring(12);		// 시작값만 주어지면
		System.out.printf("s1 : %s\n", s1); 
		String s2 = str.substring(12, 15);
		System.out.printf("s2: %s\n", s2);

		
		String str2 = "CharAtExample_Test2";
		int a1 = str2.indexOf('E');
		System.out.printf("a1: %d\n", a1);
	}

}
