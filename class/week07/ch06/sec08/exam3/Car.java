package week07.ch06.sec08.exam3;

public class Car {
	// �k�� ����
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
	// ��ȯ���� ���� �޼ҵ�� gas �ʵ尪�� 0�̸� return������ �޼ҵ� ����
	void run() {
		while (true) {
			if( gas > 0) {
				System.out.println("run. (left gas: "+ gas + ")");
				gas -=1;
			}else {
				System.out.println("Stop. (Left gas: "+ gas + ")");
				return; //�޼ҵ� ����
			}
		}
	}

}
