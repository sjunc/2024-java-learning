package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Desc desc = new Desc();
		Asc asc = new Asc();
		
		System.out.println(" Enter the start number! (1 ~ 10) ");
		asc.value= scan.nextInt();
		asc.value-=1;
		asc.asc();

	}

}
