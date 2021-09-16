package Method;

public class ATM {
	public static int withdrawal(int amount) {
		System.out.println("The withdrawal amount is "+amount);
		return 0;
	}
	public static void main(String[] args) {
		int amt=3000;
		ATM.withdrawal(amt);
	}

}
