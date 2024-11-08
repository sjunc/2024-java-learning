package week09;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// 객체 생성
		SmartPhone myPhone = new SmartPhone("iphone16", "BlueMarin");
		
		//Phone으로 부터 상속받은 필드 읽기
		System.out.println("model: " + myPhone.model);
		System.out.println("color: " + myPhone.color);
		
		//SmartPhone 의 필드 읽기
		System.out.println("Wifi statement: " + myPhone.wifi);
		
		//Phone으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("hello?");
		myPhone.receiveVoice("Hello there! this is michel ");
		myPhone.sendVoice("ah~ hmm.... who are you?");
		myPhone.hangUp();

		//SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();

	}

}
