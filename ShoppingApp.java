import java.util.function.Supplier;

class User{
    private String name;
    private int userId;
    User(String name,int userId){
        this.name=name;
        this.userId=userId;
    }
    public String getName(){
        return name;
    }
    public int getUserId(){
        return userId;
    }
    public void displayUserDetails(){
        System.out.println("Name: "+name);
        System.out.println("User ID:"+userId);
    }
    final void welcomeMessage(){
        System.out.println("Welcome to Online Shopping!");
    }
}

class Customer extends User{
    private String address;
    Customer(String name,int userId,String address){
        super(name,userId);
        this.address=address;
    }
    @Override public void displayUserDetails(){
         super.displayUserDetails();
         System.out.println("Address: "+address);
    }
    public void placeOrder(String product){
        System.out.println("Order placed for product: "+product);
    }
    public void placeOrder(String product,int quantity){
        System.out.println("Order placed for "+quantity+" units of:"+product);
    }
}

class PaymentDetails{
    private String paymentMode;
    PaymentDetails(String paymentMode){
        this.paymentMode=paymentMode;
    }
    public void showPaymentDetails(){
        System.out.println("payment done by: "+paymentMode);
    }
}
class PrimeCounter extends Customer{
    private final double discountPercentage=15.0;
    private PaymentDetails paymentDetails;
    PrimeCounter(String name,int userId,String address,String paymentMode){
        super(name, userId, address);
        this.paymentDetails=new PaymentDetails(paymentMode);
    }

    @Override
    public void displayUserDetails() {
        super.displayUserDetails();
        System.out.println("Status: Prime Member");
        System.out.println("Discount: "+discountPercentage+"%");
    }
    
    public void showDiscount(){
        System.out.println("Prime members get a discount of"+discountPercentage+"%");
    }
    public void showPaymentDetails(){
        paymentDetails.showPaymentDetails();
    }
}
public class ShoppingApp {
    public static void main(String[] args) {
        PrimeCounter pc=new PrimeCounter("Aditi",1032, "Una","PhonePay");
        pc.welcomeMessage();
        pc.displayUserDetails();
        pc.placeOrder("phone");
        pc.placeOrder("Laptop",12);
        pc.showPaymentDetails();
        pc.showDiscount();
    }
}
