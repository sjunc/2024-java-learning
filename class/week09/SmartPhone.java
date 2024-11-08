package week09;

public class SmartPhone extends phone {

	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		super();	//super(model, color); 매개변수가 없을 땐 생략가능.생성자는 상속되지 않기 때문이다. 부모의 생성자를 쓸 때는 super()를 해줘야함.
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨;");
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println(" Change the WIFI statement");
	}
	public void internet() {
		System.out.println(" Connect the internet");
	}
}
