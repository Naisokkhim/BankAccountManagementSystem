import java.math.BigDecimal;

public class BankAccountManagementSystem {
    public static void main(String[] args) {
       BankAccount account = new BankAccount("khim",12345,"0975180260","Mrkhimloy9@gmail.com", BigDecimal.valueOf(0));

       account.ShowAccountDetail();
    }
}