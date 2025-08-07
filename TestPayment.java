class Payments{
    double amount;
    Payments(){
        amount=0.0;
    }
    public void processPayment(double amount){
        System.out.println("Processing payment of rupee "+amount);
    }
}

class UPIPayments extends Payments{
    @Override public void processPayment(double amount){
        System.out.println("Processing "+amount+" via UPI Payment");
    }
}

class CreditCardPayments extends Payments{
    @Override public void processPayment(double amount){
        System.out.println("Processing "+amount+" via CreditCard Payment");
    }
}

class PayPalPayments extends Payments{
    @Override public void processPayment(double amount){
        System.out.println("Processing "+amount+" via PayPal Payment");
    }
}

class PaymentPortal{
    public void openPortal(Payments paymentMethod,double amount){
        paymentMethod.processPayment(amount);
    }
}

public class TestPayment{
    public static void main(String[] args) {
        // Payments pay=new Payments();

        // UPIPayments u=new UPIPayments();
        // CreditCardPayments c=new CreditCardPayments();
        // PayPalPayments p=new PayPalPayments();
        PaymentPortal pm=new PaymentPortal(); 

        pm.openPortal(new UPIPayments(),1500.00);
        pm.openPortal(new CreditCardPayments(),2500.75 );
        pm.openPortal(new PayPalPayments(),1000.50 );
    }
}
