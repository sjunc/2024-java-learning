package ch05.sec09;

import java.util.Arrays;

public class DeepCopy2 {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3};
		int[] b = Arrays.copyOf(a, 5);

		System.out.print(" a Array: ");
		for (int i=0;i<a.length;i++)
			System.out.print(a[i] + " ");
		
		System.out.print("\n b Array: ");
		for (int i = 0; i<b.length; i++)
			System.out.print(b[i] + " ");
		
		System.out.print("\n---------------------------------------------\n");
		b[0] = 10;	//b�� ����
		
		System.out.print(" a Array : ");
		for(int i=0; i <a.length;i++)
			System.out.print(a[i] + " ");
		
		System.out.print("\n b Array : ");
		for (int i = 0; i<b.length; i++)
			System.out.print(b[i] + " ");

	}

}
