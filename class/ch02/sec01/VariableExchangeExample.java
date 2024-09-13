/**
 * 
 */
package ch02.sec01;

/**
 * @author 210
 *
 */
public class VariableExchangeExample {

	/**
	 * 
	 */
	public VariableExchangeExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int x = 3;
		int y = 5;
		System.out.println("X:" + x + ", Y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", Y:" + y);
	}

}
