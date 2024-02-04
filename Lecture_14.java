import java.util.*;
import java.util.Scanner;

class Product {
  String title;
  int price;

  public Product(String title, int price) {
    this.title = title;
    this.price = price;
  }
}

public class Lecture_14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Product> products = new ArrayList<Product>();

    char choice;

    do {
      System.out.println("Enter the product title:");
      String title = sc.nextLine();
      System.out.println("Enter the product price:");
      int price = sc.nextInt();
      sc.nextLine();

      Product p = new Product(title, price);

      products.add(p);

      System.out.println("Do you want to add more items? (y/n)");
      choice = sc.nextLine().charAt(0);

    } while (choice == 'y' || choice == 'Y');

    Collections.sort(products, new Comparator<Product>() {
      public int compare(Product p1, Product p2) {
        return p1.title.compareTo(p2.title);
      }
    });
    int total = 0;

    System.out.println("Products List (ascending order):");
    for (Product p : products) {
      System.out.println(p.title + " - " + p.price);

      total += p.price;
    }
    System.out.println("Total Amount of all Products: " + total);
  }
}
