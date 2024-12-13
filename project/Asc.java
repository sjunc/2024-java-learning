package w14.project;

public class Asc extends Basic {

	public void asc() {
		for(int i=0; i<lineValue; i++) {
			for(int j=0; j<=10; j++) {
				if(j!=10) {
					System.out.print(value + " ");
				}
				value++;
				if(value > 10) {
					reset();
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	@Override
	public void reset() {
		
		super.reset();
	}
}
