package ch04.sec03;

public class SwitchValExam {

	public static void main(String[] args) {
		String grade = "B";
		
		//before java 12 version 
		int score1 = 0;
		switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default:
				score1 = 60;
		}
		System.out.println("score1: " + score1);
		
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" ->{
				int result = 100 - 20;
				yield result;
			}
			default -> 60;
		};
		System.out.println("Score2: " + score2);
	}

}
