package week13.ch11.test;

public final class LoginExample {

	public static void main(String[] args) {
		try {
			Login("white", "12345");
		} catch(Exception e) {
			System.out.println("Error :" + e.getMessage());
		}
		
		try {
			Login("Blue","54321");
		} catch(Exception e) {
			System.out.println("Error : "+ e.getMessage());
		}
	}
	
	public static void Login(String id, String password) throws NotExistIDException, WrongPasswordException
	{
		if (!id.equals("Blue")) {
			throw new NotExistIDException("Not id");
		}
		if(!password.equals("12345")) {
			throw new WrongPasswordException("Wrong password");
		}
	}

}
