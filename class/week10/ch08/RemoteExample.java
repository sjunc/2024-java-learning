package week10.ch08;

public class RemoteExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
		// rc 변수에 television 객체 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//디폴드 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(51);
		rc.turnOff();
		
		//디폴드 메소드 호출
		rc.setMute(true);
		rc.setMute(false);

	}

}
