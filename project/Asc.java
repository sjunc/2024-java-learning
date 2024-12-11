package project;

public class Asc extends sample {

	public void asc() {
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<=10; j++) {
				value++;
				if(value == 11) {
					reset();
				}
				if(j!=10) {
					System.out.print(value + " ");
				}
			}
			System.out.println();
		}
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		super.reset();
	}
}
