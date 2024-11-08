package week09.airplane;

public class SuperSonicAirplane extends Airplane{

	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	// 상태 필드선언
	public int flyMode = NOMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("this is supersonic flying");
		}else {
			super.fly();
	}
	}
}
