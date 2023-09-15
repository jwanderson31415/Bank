package Util;

import Services.CustomerService;
import Services.BankerService;
import Services.SigninService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        CustomerService cs = new CustomerService();
        BankerService bs = new BankerService();
        cs.addCustomer("Jason", 1000);
        cs.addCustomer("David", 2000);

        while(true){
            System.out.println("Banker or Customer?");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            if(input.equals("Banker")){
                System.out.println("Enter Username: ");
                String username = scan.nextLine();
                System.out.println("Enter Password: ");
                String password = scan.nextLine();
                String result = SigninService.checkBankerSignin(username, password);

            }
        }

    }

}
