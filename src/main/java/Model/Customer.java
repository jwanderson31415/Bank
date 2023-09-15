package Model;

public class Customer {
    double balance;
    String name;

    public Customer(String name, double initial){
        this.name = name;
        this.balance = initial;
    }
}
