package Method;

public class OddNumberChecking {
	public static int oddNumberChecking(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);

			}
		
		}
		return 0;
	}

	public static void main(String[] args) {
		int a[]= {110,111,112,113,114,115,116,117,118,119,120};
		OddNumberChecking.oddNumberChecking(a);
		
	}

}
