package week10.ch08;

public interface RemoteControl {
	
	// 인터페이스에선 모든 선언 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("Mute");
			// 추상 메소드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("turn on Mute");
		}
	}
	
	// 정적 메소드 사용 가능 public은 생략됨
	static void changeBattery() {
		System.out.println("Change remote battery");
	}

}
