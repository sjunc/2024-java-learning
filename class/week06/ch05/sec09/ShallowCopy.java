package ch05.sec09;

public class ShallowCopy {

	public static void main(String[] args) {
		int a[] = {1, 8, 3};
		int b[] = a;
		
		System.out.print(" a Array: ");
		for (int i=0;i<a.length;i++)
			System.out.print(a[i] + " ");
		
		System.out.print("\n b Array");
		for (int i = 0; i<b.length; i++)
			System.out.print(b[i] + " ");
		
		System.out.print("\n---------------------------------------------\n");
		b[0] = 10;	//b를 변경
		
		System.out.print(" a Array : ");
		for(int i=0; i <a.length;i++)
			System.out.print(a[i] + " ");
		
		System.out.print("\n b Array : ");
		for (int i = 0; i<b.length; i++)
			System.out.print(b[i] + " ");
		// b를 변경했는데 a도 변경됨. 
		
		//  deep copy 기초
		
		int c[] = {1, 8, 3};
		int d[] = c.clone();
		
		System.out.print("\n c Array: ");
		for (int i=0;i<c.length;i++)
			System.out.print(c[i] + " ");
		
		System.out.print("\n d Array: ");
		for (int i = 0; i<d.length; i++)
			System.out.print(d[i] + " ");
		
		System.out.print("\n---------------------------------------------\n");
		d[0] = 10;	//b를 변경
		
		System.out.print(" c Array : ");
		for(int i=0; i <c.length;i++)
			System.out.print(c[i] + " ");
		
		System.out.print("\n d Array : ");
		for (int i = 0; i<d.length; i++)
			System.out.print(d[i] + " ");
		//d를 변경하여 c는 변경되지 않음
	}
}
