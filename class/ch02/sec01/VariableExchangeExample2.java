/**
 * 
 */
package ch02.sec01;

/**
 * @author 210
 *
 */
public class VariableExchangeExample2 {

	/**
	 * 
	 */
	public VariableExchangeExample2() {
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
		
		int[] iMixArr = {0, 0};
		iMixArr[0] = y;
		iMixArr[1] = x;
		
		x = iMixArr[0];
		y = iMixArr[1];
		System.out.println("x:" + x + ", Y:" + y);
	}

}
