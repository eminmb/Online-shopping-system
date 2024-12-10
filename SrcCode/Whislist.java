package SrcCode;

import java.util.ArrayList;
import java.util.List;

public class Wishlist {
    private List<Product> items;
    public Wishlist() {
        this.items = new ArrayList<>();
    }
    public void addItem(Product product) {
        if (!items.contains(product)) {
            items.add(product);
            System.out.println(product.getName() + " added to wishlist.");
        } else {
            System.out.println(product.getName() + " is already in the wishlist.");
        }
    }
    public void removeItem(Product product) {
        if (items.contains(product)) {
            items.remove(product);
            System.out.println(product.getName() + " removed from wishlist.");
        } else {
            System.out.println(product.getName() + " is not in the wishlist.");
        }
    }
    public void viewWishlist() {
        if (items.isEmpty()) {
            System.out.println("Your wishlist is empty.");
        } else {
            System.out.println("Your wishlist:");
            for (Product item : items) {
                System.out.println("- " + item.getName());
            }
        }
    }
    public List<Product> getItems() {
        return items;
    }
}
