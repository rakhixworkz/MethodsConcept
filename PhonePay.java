package Method;

public class PhonePay {
	public static void transferMoney() {
		System.out.println("Transfer money successfully");
	}
	public static void rechargeMobile() {
		System.out.println("Mobile recharge done");
	}
	public static void rechargeDTH() {
		System.out.println("DTH recharge done");
	}
	public static void electricityBill() {
		System.out.println("electricity bill paid");
	}

	public static void main(String[] args) {
		System.out.println("Login into phonepay");
		PhonePay.transferMoney();
		PhonePay.electricityBill();
		PhonePay.rechargeMobile();
		PhonePay.rechargeDTH();
		System.out.println("Log out from phonepay");
	}

}
