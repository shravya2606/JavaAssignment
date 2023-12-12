package simple1;
import java.util.Scanner;
public class hotelMenu {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			String[][] menu = {
			        {"Veg Section", "1. Veg Dish 1", "2. Veg Dish 2", "3. Veg Dish 3"},
			        {"Non-Veg Section", "4. Non-Veg Dish 1", "5. Non-Veg Dish 2", "6. Non-Veg Dish 3"},
			        {"Beverages", "7. Beverage 1", "8. Beverage 2", "9. Beverage 3"}
			};

			int choice;
			do {
			    displayMenu(menu);
			    System.out.println("Enter your choice (1-9) or 0 to No order: ");
			    choice = sc.nextInt();

			    if (choice >= 1 && choice <= 9) {
			        placeOrder(menu, choice);
			    } else if (choice != 0) {            
			        System.out.println("Invalid choice. Please enter btn 1 n 9.");
			    }

			} while (choice != 0);
		}

        System.out.println("It's a No order. Thank you for visiting");
    }

    private static void displayMenu(String[][] menu) {
        System.out.println("\n Hotel Menu");
        for (String[] section : menu) {
            for (String item : section) {
                System.out.println(item);
            }
        }
    }

    private static void placeOrder(String[][] menu, int choice) {
        int sectionIndex = (choice - 1) / 3;
        int itemIndex = (choice - 1) % 3;
        System.out.println("You ordered: " + menu[sectionIndex][itemIndex]);
    }
}
//20. Micro project.