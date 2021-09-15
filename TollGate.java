package Method;

public class TollGate {
	public static void openGate() {
		System.out.println("Gate opened");
	}
	public static void collectMoney() {
		System.out.println("Paid money");
	}
	public static void closeGate() {
		System.out.println("Gate closed");
	}

	public static void main(String[] args) {
		System.out.println("Entering into toll gate");
		TollGate.openGate();
		TollGate.collectMoney();
		TollGate.closeGate();
		System.out.println("Exit from toll gate");
	}

}
