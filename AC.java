package Method;

public class AC {
	public static void onAC() {
		System.out.println("on AC");
	}
	public static void offAC() {
		System.out.println("off AC");
	}
	public static void increaseTemp() {
		System.out.println("Increase the AC temperature");
	}
	public static void decreaseTemp() {
		System.out.println("Decrease the AC temperature");
	}
	public static void main(String[] args) {
		System.out.println("Functions of Ac : ");
		AC.onAC();
		AC.offAC();
		AC.decreaseTemp();
		AC.increaseTemp();
	}

}
