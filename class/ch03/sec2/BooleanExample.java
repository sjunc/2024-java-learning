package ch03.sec2;

public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;
		if(stop) {
			System.out.println(" 장비를 정지합니다.");
			{
				System.out.println(" 가동합니다.");
			}
		}
	}

}
