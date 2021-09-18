package Method;

public class VtuResults {
	public static String results(String usn) {
		String myUsn="1AY15IS079";
		if(usn==myUsn) {
			String result="Percentage is 75";
			return result;
		}
		else {
			System.out.println("Invalid USN");
		}
		return "0";
	}
	public static void main(String[] args) {
		String result=VtuResults.results("1AY15IS079");
		System.out.println(result);
	}

}
