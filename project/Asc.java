package project;

public class Asc extends sample {

	public void asc() {
		for(int i=0; i<10; i++) {
			for(int j=0; j<=10; j++) {
				if(j!=10) {
					System.out.print(value + " ");
				}
				value++;
				if(value == 11) {
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
