import java.awt.*;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.SplittableRandom;

public class BankAccount {
private String UserName;
private int AccountNumber;
private String PhoneNumber;
private String Email;
private BigDecimal CurrentMoneys;
public int getAccountNumber(){return AccountNumber;}
    public String getUserName() {
        return UserName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }


    public String getEmail() {
        return Email;
    }


    public BigDecimal getCurrentMoneys() {
        return CurrentMoneys;
    }

public BankAccount (String userName, int accountNumber , String phoneNumber, String Email,BigDecimal CurrentMoney){
this.UserName = userName ;
this.AccountNumber = accountNumber;
this.PhoneNumber = phoneNumber;
this.Email =  Email;
this.CurrentMoneys = CurrentMoney;
}
    public void ShowAccountDetail (){
        System.out.println("User name        : "+UserName);
        System.out.println("Account Number   : "+AccountNumber);
        System.out.println("Phone number     : "+PhoneNumber);
        System.out.println("Email            : "+Email);
        System.out.println("Current Money    : "+CurrentMoneys);
    }


}
