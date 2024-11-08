package week09;

public class phone {
	
	public String model;
	public String color;
	
	// 기본 생성자를 선언
	public phone() {
		System.out.println("phone() 생성자 실행");
	}
	
	public void bell() {
		System.out.println("bell is ringing");
	}
	
	public void sendVoice(String message) {
		System.out.println(" ME : " + message);
	}
	public void receiveVoice(String message) {
		System.out.println("YOU" + message);
	}
	public void hangUp() {
		System.out.println(" Finish the call");
	}

}
