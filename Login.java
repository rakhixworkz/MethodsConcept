package Method;

public class Login {
	public static boolean login(String userName,String password) {
		boolean login;
		String name="Rakhi";
		String passcode="1234ra";
		if(userName==name&&password==passcode) {
			System.out.println("Login successfully");
			login=true;
		}
		else {
			System.out.println("login insuccessfully");
			login=false;
		}
		return login;
	}

	public static void main(String[] args) {
		Login.login("Rakhi","123ra");
	}

}
