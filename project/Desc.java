package w14.project;

public class Desc extends Basic {

	public void desc() {
		
		for(int i=lineValue; i>0; i--) {
			for(int j=lineValue; j>=0; j--) {

				if(j!=0) {
					System.out.print(value + " ");
				}
				value--;
				if(value == 0) {
					reset();
				}
				
			}
			System.out.println();
		}
	}

	@Override
	public void reset() {
		value = 10;
	}
}
