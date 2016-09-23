package Shop;
import java.util.Scanner;

public class CashRegister {
    private Storehouse store;
    private Scanner reader;
    
    public CashRegister(Storehouse store,Scanner reader){
        this.store = store;
        this.reader = reader; }
    
    public void manage(String customer){
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop " + customer);
        System.out.println("below is our sale offer:");
        
        store.productList();
        
        while(true){
            System.out.print("what do you want to buy (press enter to pay):");
            String product = reader.nextLine();
            if(product.isEmpty()) break; 
            if(store.getStock(product) > 0){
                Product x = store.getProduct(product);
                store.buyProduct(product, 1);
                basket.addPurchase(x, 1); }
            else System.out.println("Product not available!"); } 
    
     System.out.println("your purchases are:");
     basket.productList();
     System.out.println("basket price: " + basket.totalPrice());}
    
    
}
