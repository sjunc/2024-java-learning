package ch05.sec11;

import java.util.Calendar;

public class weekExample {
	public static void main(String[] args) {
		//week 열거 타입 변수 선언
		Week today = null;
		
		//Calendar 열기
		Calendar cal = Calendar.getInstance();
		
		// 오늘의 요일 얻기 1 ~ 7
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// 숫자를 열거 상수로 변환해서 변수 대임
		switch(week) {
		case 1: today = Week.Sunday ;			break;
		case 2: today = Week.Monday ;			break;
		case 3: today = Week.Tuesday ;			break;
		case 4: today = Week.Wednesday ;		break;
		case 5: today = Week.Thursday ;			break;
		case 6: today = Week.Friday ;			break;
		case 7: today = Week.Saturday ;			break;
		}
		// 열거 타입 변수 사용
		if(today == Week.Sunday) {
			System.out.println("sunday is soccer day" + Week.Sunday);
		}else {
			System.out.println("study java hard " + ".." + today);
		}
	}// ctrl + space 임포트 

}
