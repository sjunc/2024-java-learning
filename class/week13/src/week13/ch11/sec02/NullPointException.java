package week13.ch11.sec02;

public class NullPointException {
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("String size: "+ result);
		}catch(NullPointerException e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println(e.toString());
		}finally {
			System.out.println("[Last execute] \n");
		}
	}
	public static void main(String[] args) {
		System.out.println("[Program Start]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[Program End]\n");

	}
}
