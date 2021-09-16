package Method;

public class CheckEven {
	public static void evenNumberChecking(int arr[]) {
		int a[]= {110,111,112,113,114,115,116,117,118,119,120};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);

			}
		
		}
	}

	public static void main(String[] args) {
			CheckEven.evenNumberChecking(null);
	}

}
