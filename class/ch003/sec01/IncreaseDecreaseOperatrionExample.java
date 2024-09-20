package ch03.sec01;

public class IncreaseDecreaseOperatrionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		
		x++;  // 후증가
		++x;  // 선증가
		System.out.println("x= " + x); // x = 12
		System.out.println("-------------------");
		y--;
		--y;	//9
		System.out.println("y = " + y); 	//8
		z = x++;
		System.out.println("z= " + z);//13		12 네?
		System.out.println("x =" + x); // 13
		z = ++x;
		System.out.println("z= "+ z);	//14
		System.out.println("x= "+ x);	//14
		z = ++x + y++; // 15 + 8 ? 
		System.out.println("x: " +x); //15
		System.out.println("y: " +y); //9
		System.out.println("Z: " + z); // 24 23 네?
		

	}
}
