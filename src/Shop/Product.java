package Shop;

public class Product {
    private String name;
    private double price;
    private int stock;
    private int amount = 0;
    
    public Product(String name,double price){
        this.name = name;
        this.price = price;}
    
    public String getName(){
        return this.name;}
    
    public double getPrice(){
        return this.price;}
    
    public int getStock(){
        return this.stock;}
    
    public int getAmount(){
        return this.amount;}
    
    public void setStock(int stock){
        this.stock = stock;}
    
    public void setAmount(int amount){
        this.amount += amount;}
    
    public void changeStock(int amount){
        this.stock -= amount;}
}
