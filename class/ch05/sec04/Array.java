package ch05.sec04;

public class Array {

	public static void main(String[] args) {
		// Null 로 잡고 시작하기. 
		String[] season = { "Spring", "Summer", "Fall", "winter"};
		
		System.out.println("season[o]: "+ season[0]);
		System.out.println("season[1]: "+ season[1]);
		System.out.println("season[2]: " + season[2]);
		System.out.println("Season[3] "+ season[3]);
		
		season[1] = "여름";
		System.out.println("Season[1]: " + season[1]);
		System.out.println();
		
		int[] scores = {83, 90, 90};
		
		int sum = 0;
		for(int i = 0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("Total: "+ sum);
		double avg = (double) sum /3;
		System.out.println("AVG : " + avg);
		
	}

}
