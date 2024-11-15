package week10.ch08extends;

public class ExtendsExample {

	public static void main(String[] args) {
		InterfaceCimpl impl = new InterfaceCimpl();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		System.out.println();

	}

}
