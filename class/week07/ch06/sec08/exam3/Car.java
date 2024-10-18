package week07.ch06.sec08.exam3;

public class Car {
	// 픨드 선언
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("no gas");
			return false;
		}
		System.out.println("You have gas");
		return true;
	}
	// 반환값이 없는 메소드로 gas 필드값이 0이면 return문으로 메소드 종료
	void run() {
		while (true) {
			if( gas > 0) {
				System.out.println("run. (left gas: "+ gas + ")");
				gas -=1;
			}else {
				System.out.println("Stop. (Left gas: "+ gas + ")");
				return; //메소드 종료
			}
		}
	}

}
