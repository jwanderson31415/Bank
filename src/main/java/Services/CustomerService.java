package Services;
import Model.Customer;
//import Util.LogUtil;

import java.util.ArrayList;
import java.util.List;
public class CustomerService {
    List<Customer> BankCustomers;

    public CustomerService(){
        BankCustomers = new ArrayList<>();
        //logutil
    }

    public CustomerService(List<Customer> x){
        BankCustomers = x;

    }

    public void addCustomer(String name, double initial){
        Customer x = new Customer(name, initial);
        BankCustomers.add(x);
    }

}
