
// ***************************************************************
// ShoppingCart.java
//
// Represents a shopping cart as an array of items
// ***************************************************************
import java.text.NumberFormat;

public class ShoppingCart {
	
    private Item[] cart; // an array of Items
    private int itemCount; // total number of items in the cart
    private double totalPrice; // total price of items in the cart
    private int capacity; // current cart capacity

    // ---------------------------------------------------------
    // Creates an empty shopping cart with a capacity of 5 items.
    // ---------------------------------------------------------
    public ShoppingCart() {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }

    // -----------------------------------------------------
    // Adds an item to the shopping cart.
    // -----------------------------------------------------
    public void addToCart(String itemName, double price, int quantity) {
    	if (capacity == cart.length)
    		increaseSize();
    		cart[capacity] = new Item(itemName, price, quantity);
    		totalPrice += price;
    		capacity++;
    }

    // -----------------------------------------------------
    // Returns the contents of the cart together with // summary information.
    // -----------------------------------------------------
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping Cart\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
        for (int i = 0; i < itemCount; i++)
            contents += cart[i].toString() + "\n";
        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }

    // -----------------------------------------------------
    // Increases the capacity of the shopping cart by 3
    // -----------------------------------------------------
    private void increaseSize() {
    	Item[] temp = new Item[cart.length + 3];
    	for (int i = 0; i < cart.length; i++)
    	temp[i] = cart[i];
    	cart = temp;
    }


    // ---------------------------------------------------------
    // Returns the total price of the items in the cart.
    // ---------------------------------------------------------
//    public double getTotal() {
//    }
    
    public static void main(String[] args) {
    	ShoppingCart shop = new ShoppingCart();
    	shop.addToCart("basketball", 5.00, 2);
    	shop.addToCart("baseball bat", 125.00, 1);
    	System.out.println(shop.toString());
    }
}