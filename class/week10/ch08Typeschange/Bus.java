package week10.ch08Typeschange;

public class Bus implements Vehicle{

	int iNo = 0;
	
	@Override
	public void run() {
		iNo++;
		System.out.println("Bus Running" + iNo);
	}
	
	// 추가 메소드
	public void checkFare() {
		System.out.println("charge(money) check");
	}

}
