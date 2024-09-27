package ch04.sec03;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) 
		{
			case 'A':
			case 'a':
				System.out.println("Vip");
				break;
			case 'B':
			case 'b':
				System.out.println("Common");
				break;
			default:
				System.out.println("customer");
		}
		switch(grade)
		{
			case 'A', 'a' -> {
				System.out.println("Vip");
			}
			case 'B', 'b' -> {
				System.out.println("common");
			}
			default -> {
				System.out.println("customer");
			}
		}
		switch(grade)
			{
				case 'A', 'a' -> System.out.println("Vip");
				case 'B', 'b' -> System.out.println("common");
				default -> System.out.println("customer");
		}
	}

}
