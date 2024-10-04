package ch05.sec03;

public class EqualsExample {

	public static void main(String[] args) {
		
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("StrVar1 and strVar2 have same index 참조가 같음");
		}else {
			System.out.println("Strvar1 and StrVar2 have different index");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("Strvar1과 Strvar2는 문자열이 같음");
		}
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3==strVar4) {
			System.out.println("StrVar3 and strVar4 have same index 참조가 같음");
		}else {
			System.out.println("Strvar3 and StrVar4 have different index");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("Strvar3과 Strvar4는 문자열이 같음");
			// 공백도 스택이 지정되서 비교 가능
		String strVar5 = null;
		System.out.println("Check " + (strVar5 == ""));
		// null 과 "" 공백은 다름. 
			
		}
	}

}
