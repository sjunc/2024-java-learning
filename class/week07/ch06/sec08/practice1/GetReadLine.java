package week07.ch06.sec08.practice1;

import java.util.Scanner;

public class GetReadLine {
	int value;
	Scanner sc = new Scanner(System.in);
	public int GetReadLineNo() 
	{
		System.out.println("Input a number between 1 to 20");
		return Integer.parseInt(sc.nextLine());
	}
	
	
	
	

}
