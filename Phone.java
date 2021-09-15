package Method;

public class Phone {

		public static void calls() {
			System.out.println("calling.....");
		}
		public static void messages() {
			System.out.println("i got 100 messages per day");
		}
		public static void apps() {
			System.out.print("My apps are :");
			System.out.println("Whatsapp,facebook,instagram,flipcart,myntra");
		}

		public static void main(String[] args) {
			System.out.println("My phone contains :");
			Phone.calls();
			Phone.messages();
			Phone.apps();
		}

	}


