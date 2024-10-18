package week07.ch06.sec08.exam3;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		// 컴파일러가 자동으로 만든 생성자 Car로 객체 myCar를 new로 생성함.
		
		//리턴 값이 없는 setGas 메소드 호출
		myCar.setGas(5);
		
		//isLeftGas 메소드 호출해서 받은 리턴값이 true 일 경우 if 블록실행
		if(myCar.isLeftGas()) {
			System.out.println("Let's Go");
			// 리턴값이 없는 run 메소드 호출
			myCar.run();
		}
		System.out.println("Insert the gas!");
		

	}

}
