package Shop;
import java.util.TreeMap;

public class ShoppingBasket {
    private TreeMap<String,Product> purchases = new TreeMap<String,Product>();
    
    public void addPurchase(Product product, int amount){
        product.setAmount(amount);
        purchases.put(product.getName(), product);}
    
    public double totalPrice(){
        double x = 0;
        for(Product y : purchases.values()){
            x += y.getPrice(); }
        return x; }
    
    public void productList(){
        for(String x : purchases.keySet()){
            System.out.println(x + ":" + purchases.get(x).getAmount());}}
    
}
