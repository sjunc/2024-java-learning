package ch05.sec03;

public class LengthReplaceExample {

	public static void main(String[] args) {
		//-------------------------------------------------
		
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("ssn number size correct");
		}else {
			System.out.println("Wrong");
		}

		//======================================
		String oldStr = "Java String is immutable.Java string";
		String newStr = oldStr.replace("Java", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
