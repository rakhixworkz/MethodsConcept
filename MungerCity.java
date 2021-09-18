package Method;

public class MungerCity {
	public static void getNotification() {
		System.out.println("office will shift to new place"+" address will be updated soon");
	}
	public static String electricityBill(String custId,int amount) {
		String confirmMessage="Electricity bill paid successfully for customerId:" +custId;
		return confirmMessage;
		
		
	}

	public static void main(String[] args) {
		System.out.println("Beggining of the program");
		MungerCity.getNotification();
		String confirmMessage=MungerCity.electricityBill("12345678",2200);
		System.out.println(confirmMessage);
		System.out.println("Ending of the program");
	}

}
