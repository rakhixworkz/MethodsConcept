package Method;

public class PhonePay1 {
	public static String wallet(String myMoney,String upiPin) {
	String pin="1234ab";
	if(upiPin==pin) {
		String walletAmount="My wallet amount is: "+myMoney;
		return walletAmount;
	}
	else {
		System.out.println("Incorrect upiPin");
	}
	return "Invalid";
	
}
	public static String checkBankBalance(String myBalance,String upi) {
		String myPin="9852";
		if(upi==myPin) {
			String balanceAmount="My bank balance is : "+myBalance;
			return balanceAmount; 
		}
		else {
			System.out.println("Incorrect pin");
		}
		return "0";
	}
	public static String MobileRecharge(long mobileNumber,String mobileSim[],int rechargePlan[]) {
		String sim[]= {"Airtel","Jio","Voda","Reliance"};
		int plan[]= {199,299,399,499};
		for(int i=0;i<sim.length;i++) {
			if(mobileSim[i]==sim[i]) {
				 String mobileCarrier="Recharge done for sim : "+mobileSim[i];
				 return mobileCarrier;
			}
			else {
				System.out.println("Invalid sim");
			}
		}
		for(int j=0;j<plan.length;j++) {
			if(rechargePlan[j]==plan[j]) {
				String myPlan="Recharge amount is :" +rechargePlan[j];
			}
			else {
				System.out.println("Invalid plan");
			}
		}
		return "0";

	}


	public static void main(String[] args) {
		String phoneSim[]={"Airtel","Jio","Voda","Reliance"};
		int myPlan[]={199,299,399,499};
		System.out.println("Login into Phonepay");
		String walletAmount=PhonePay1.wallet("4000", "1234ab");
		System.out.println(walletAmount);
		String balanceAmount=PhonePay1.checkBankBalance("5000", "9852");
		System.out.println(balanceAmount);
		String mobileCarrier=PhonePay1.MobileRecharge(9876573622l,phoneSim,myPlan);
		System.out.println(mobileCarrier);
		System.out.println("Logout from phonepay");
		
	}

}
