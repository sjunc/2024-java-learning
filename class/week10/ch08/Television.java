package week10.ch08;

public class Television implements RemoteControl{

	// 필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV Turn on.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV Turn off.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
	System.out.println("Current TV Volume: " + this.volume);
	}

	
}
