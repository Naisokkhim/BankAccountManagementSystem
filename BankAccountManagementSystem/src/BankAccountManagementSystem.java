
import java.math.BigDecimal;
import java.util.Scanner;

public class BankAccountManagementSystem {

    public BankAccountManagementSystem(String AccountName, int accountNumber, String AccountPhoneNumber, String AccountGmail, BigDecimal CurrentMoney){
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount(AccountName,accountNumber,AccountPhoneNumber,AccountGmail,CurrentMoney);
        account.ShowAccountDetail();
        int ch;
        BigDecimal depositAmount;
        BigDecimal withDrawAmount;

        do {
            System.out.println("======= Banking System =======");
            System.out.println("1. Deposit found \n2. Withdraw found \n3. Show Account detail \n4. Exit");
            ch = input.nextInt();
            switch (ch){
                case 1 :
                    System.out.println("Amount to deposit : ");
                    depositAmount = input.nextBigDecimal();
                    account.deposit(depositAmount);
                    break;
                case 2 :
                    System.out.println("Withdraw amount : ");
                    withDrawAmount = input.nextBigDecimal();
                    account.WithDraw(withDrawAmount);
                    break;
                case 3 : account.ShowAccountDetail();break;
                default:
                    System.out.println("wrong choice !!!!");
                    break;
            }
        }while(ch !=4);
    }

}