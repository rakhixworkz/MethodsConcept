package Method;

public class Amazon {
	public static void viewOrders() {
		System.out.print("order status :");
		System.out.println("order placed successfully");
	}
	public static void addToCart() {
		System.out.println("clothes");
		System.out.println("Foot wear");
	}
	public static void addToWishlist() {
		System.out.println("jackets");
		System.out.println("sweaters");
	}

	public static void main(String[] args) {
		System.out.println("Login into Amazon");
		Amazon.viewOrders();
		Amazon.addToCart();
		Amazon.addToWishlist();
		System.out.println("Logout from Amazon");

	}

}
