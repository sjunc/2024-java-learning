package week07.ch06.sec08.exam3;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		// �����Ϸ��� �ڵ����� ���� ������ Car�� ��ü myCar�� new�� ������.
		
		//���� ���� ���� setGas �޼ҵ� ȣ��
		myCar.setGas(5);
		
		//isLeftGas �޼ҵ� ȣ���ؼ� ���� ���ϰ��� true �� ��� if ��Ͻ���
		if(myCar.isLeftGas()) {
			System.out.println("Let's Go");
			// ���ϰ��� ���� run �޼ҵ� ȣ��
			myCar.run();
		}
		System.out.println("Insert the gas!");
		

	}

}
