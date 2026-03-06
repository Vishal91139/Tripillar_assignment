// Create an interface Payment with method pay(). Implement it in CreditCardPayment and UPIPayment classes.
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    String cardNumber;

    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}

class UPIPayment implements Payment {
    String upiId;

    UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI ID: " + upiId);
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("1234-5678-9012");
        Payment p2 = new UPIPayment("vishal@upi");

        p1.pay(2500);
        p2.pay(1500);
    }
}
