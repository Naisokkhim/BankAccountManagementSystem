import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner userOrder = new Scanner(System.in);
        int Coca = 10;
        int Sting = 10;
        int Water = 10;
        int Prime = 10;
        BigDecimal UserMoney = BigDecimal.valueOf(10);
        BigDecimal[] MenuPrice = {
                BigDecimal.valueOf(0.75),
                BigDecimal.valueOf(0.75),
                BigDecimal.valueOf(0.25),
                BigDecimal.valueOf(2.50)
        };

        int order;
        int record=0;
        do {
            System.out.println("==== A6 Vending Machine ===\n");
            System.out.println("1. Coca  "+MenuPrice[0]+"$ (" + Coca + " Remaining)\n2. Sing  "+MenuPrice[1]+"$ (" + Sting + " Remaining)\n3. Water "+MenuPrice[2]+"$ (" + Water + " Remaining)\n4. Prime "+MenuPrice[3]+"$ (" + Prime + " Remaining)\n5. Check Balanced\n6. Exit");
            System.out.println("Please Make order By Number : ");
            order = userOrder.nextInt();

            if (order == 1 && UserMoney.compareTo(MenuPrice[0])>= 0) {
                UserMoney = UserMoney.subtract(MenuPrice[0]);
                record += 1;
                System.out.println("==== Order Reception [" + record + "]===");
                System.out.println("Purchased : Coca ");
                System.out.println("Qty       : 1 (Recent Order " + (10 - Coca)+")");
                System.out.println("Price     :" + MenuPrice[0]+"$");
                System.out.println("Your Money Remain Money :" + UserMoney+"$");
                Coca -= 1;

            } else if (order == 2 && UserMoney.compareTo(MenuPrice[1])>= 0) {
                UserMoney = UserMoney.subtract(MenuPrice[1]);
                record += 1;
                System.out.println("==== Order Reception [" + record + "]===");
                System.out.println("Purchased : Sting ");
                System.out.println("Qty       : 1 (Recent Order " + (10 - Sting)+")");
                System.out.println("Price     :" + MenuPrice[1]+"$");
                System.out.println("Your Money Remain Money :" + UserMoney+"$");
                System.out.print("\nEnter To back to Menu ..... ");
                char ch = (char) System.in.read();
                Sting -= 1;
            } else if (order == 3 && UserMoney.compareTo(MenuPrice[2])>= 0) {
                UserMoney = UserMoney.subtract(MenuPrice[2]);

                record += 1;
                System.out.println("==== Order Reception [" + record + "]===");
                System.out.println("Purchased : Water ");
                System.out.println("Qty       : 1 (Recent Order " + (10 - Water)+")");
                System.out.println("Price     :" + MenuPrice[2]+"$");
                System.out.println("Your Money Remain Money :" + UserMoney+"$");
                System.out.print("\nEnter To back to Menu ..... ");
                char ch = (char) System.in.read();
                Water -= 1;
            } else if (order == 4 && UserMoney.compareTo(MenuPrice[3])>= 0) {
                UserMoney = UserMoney.subtract(MenuPrice[3]);
                record += 1;
                System.out.println("==== Order Reception [" + record + "]===");
                System.out.println("Purchased : Prime ");
                System.out.println("Qty       : 1 (Recent Order " + (10 - Prime)+")");
                System.out.println("Price     :" + MenuPrice[3]+"$");
                System.out.println("Your Money Remain Money :" + UserMoney+"$");
                System.out.print("\nEnter To back to Menu ..... ");
                char ch = (char) System.in.read();
                Prime -= 1;
            } else if (order == 5) {
                System.out.println("Your Current Balanced : "+UserMoney+"$");
            } else if (order > 6 || UserMoney.compareTo(MenuPrice[0]) <= 0){
                System.out.println("\nError Something Wrong Please Check your Choice Or Balanced !!");
                System.out.print("\nEnter To back to Menu ..... ");
                char ch = (char) System.in.read();
            }
        }while(order != 6);
System.out.println("66Thank You Sir please come again !!!");
    }
}
