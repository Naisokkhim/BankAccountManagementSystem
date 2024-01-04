import java.math.BigDecimal;

public class BankAccount {
private String UserName;
private int AccountNumber;
private String PhoneNumber;
private String Email;
private BigDecimal CurrentMoneys;
public int getAccountNumber(){return AccountNumber;}
    public void setCurrentMoneys(BigDecimal CurrentMoneys){
    this.CurrentMoneys = CurrentMoneys;
    }
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
        System.out.println("==== Account detail ====");
        System.out.println("User name        : "+UserName);
        System.out.println("Account Number   : "+AccountNumber);
        System.out.println("Phone number     : "+PhoneNumber);
        System.out.println("Email            : "+Email);
        System.out.println("Current Money    : "+CurrentMoneys);
    }
    public void deposit(BigDecimal deposited){
        BigDecimal CurrentMoneys = getCurrentMoneys();
        deposited =CurrentMoneys.add(deposited);
        setCurrentMoneys(deposited);
        System.out.println("Successfully deposited !!!!");
    }
    public void WithDraw(BigDecimal WithDrawAmount){
    if(getCurrentMoneys().compareTo(BigDecimal.ZERO) <= 0){
        System.out.println("You have no money left..!");
    }
    else {
        if (WithDrawAmount.compareTo(getCurrentMoneys()) > 0){
            System.out.println("Not enough money to withdraw!!!");
        }
        else{
            setCurrentMoneys(getCurrentMoneys().subtract(WithDrawAmount));
            System.out.println("withdraw Successful !!\nThank you sir!!");
        }
    }
    }
}
