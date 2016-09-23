package Shop;
import java.util.TreeMap;
        
public class Storehouse {
    private TreeMap<String,Product> storage = new TreeMap<String,Product>();
    
    public void addProduct(Product product,int stock){
        product.setStock(stock);
        storage.put(product.getName(),product);}
    
    public double getPrice(String product){
        if(storage.containsKey(product)){
            return storage.get(product).getPrice(); }
        else return -99.99; }
    
    public int getStock(String product){
        if(storage.containsKey(product)){
            return storage.get(product).getStock(); }
        else return 0; }
    
    public boolean buyProduct(String product, int amount){
        boolean x = false;
        Product y = storage.get(product);
        if(storage.containsKey(product)){
            if((y.getStock() - amount) >= 0){
                y.changeStock(amount);
                x = true;}}
        return x;}
    
    public void productList(){
        for(String x : storage.keySet()){
            System.out.println(x);}}
    
    public Product getProduct(String product){
        return storage.get(product);}
}
