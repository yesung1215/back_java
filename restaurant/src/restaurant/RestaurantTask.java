package restaurant;

public class RestaurantTask {
	public static void main(String[] args) {
		Restaurant bob = new Restaurant("밥집", "닭볶음탕", 4);
		MenuItem menu = new MenuItem("초밥", 15000, 51);
		
		bob.registerMenu(menu);
	}
}
