package ch05.sec11;

import java.util.Calendar;

public class weekExample {
	public static void main(String[] args) {
		//week ���� Ÿ�� ���� ����
		Week today = null;
		
		//Calendar ����
		Calendar cal = Calendar.getInstance();
		
		// ������ ���� ��� 1 ~ 7
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// ���ڸ� ���� ����� ��ȯ�ؼ� ���� ����
		switch(week) {
		case 1: today = Week.Sunday ;			break;
		case 2: today = Week.Monday ;			break;
		case 3: today = Week.Tuesday ;			break;
		case 4: today = Week.Wednesday ;		break;
		case 5: today = Week.Thursday ;			break;
		case 6: today = Week.Friday ;			break;
		case 7: today = Week.Saturday ;			break;
		}
		// ���� Ÿ�� ���� ���
		if(today == Week.Sunday) {
			System.out.println("sunday is soccer day" + Week.Sunday);
		}else {
			System.out.println("study java hard " + ".." + today);
		}
	}// ctrl + space ����Ʈ 

}
