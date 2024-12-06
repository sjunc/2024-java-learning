package week13.ch11.sec02;

public class NullException {
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("String Length : "+ result);
	}

	public static void main(String[] args) {
		System.out.println("[Program start] \n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[Program End]");

	}
}		//try catch 비용이 높아 최소한으로 사용(어쩔 수 없이 예외가 생기는 경우, 일부로 만드는 경우)
