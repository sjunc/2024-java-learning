package w14.project;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Asc asc = new Asc();
		Desc desc = new Desc();

		System.out.println(" Enter the start number! (1 ~ 10) ");
		asc.value = scan.nextInt();
		desc.value = scan.nextInt();
		asc.asc();
		desc.desc();

	}

}
