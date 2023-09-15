package Services;
import Util.LogUtil;

public class SigninService {
    BankerService bankerService;
    CustomerService customerService;

    public SigninService(){
        LogUtil.log.info("Setting up sign in service");
    }
    public SigninService(BankerService b, CustomerService c){
        this.bankerService = b;
        this.customerService = c;
    }

    public static boolean checkBankerSignin(String username, String password) {
        if(username.equals("username123")&&(password.equals("password123")))
            return true;
        else return false;

    }
}
