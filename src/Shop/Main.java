package Shop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Storehouse store = new Storehouse();
        ShoppingBasket basket = new ShoppingBasket();
        
        Product p1 = new Product("milk",3.99);
        Product p2 = new Product("cofee",5.99);
        Product p3 = new Product("buttermilk",2.99);
        Product p4 = new Product("bread",7.99);
        
        store.addProduct(p1, 20);
        store.addProduct(p2, 10);
        store.addProduct(p3, 55);
        store.addProduct(p4, 8);
        
        CashRegister shop = new CashRegister(store, new Scanner(System.in));
        shop.manage("Pekka");
    }
    
}
