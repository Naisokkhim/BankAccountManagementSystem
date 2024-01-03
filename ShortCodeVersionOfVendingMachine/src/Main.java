import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] stock = {10, 10, 10, 10};
        BigDecimal userMoney = BigDecimal.TEN;
        BigDecimal[] menuPrice = {BigDecimal.valueOf(0.75), BigDecimal.valueOf(0.75), BigDecimal.valueOf(0.25), BigDecimal.valueOf(2.50)};
        String[] items = {"Coca", "Sting", "Water", "Prime"};
        int order;

        do {
            System.out.println("==== A6 Vending Machine ===\n");
            for (int i = 0; i < menuPrice.length; i++)
                System.out.println((i + 1) + ". " + items[i] + "  " + menuPrice[i] + "$ (" + stock[i] + " Remaining)");

            System.out.println((menuPrice.length + 1) + ". Check Balanced\n" + (menuPrice.length + 2) + ". Exit\nPlease Make order By Number : ");
            order = scanner.nextInt();

            if (order >= 1 && order <= menuPrice.length && userMoney.compareTo(menuPrice[order - 1]) >= 0 && stock[order - 1] > 0) {
                userMoney = userMoney.subtract(menuPrice[order - 1]);
                stock[order - 1]--;
                System.out.println("==== Order Reception [" + (10 - stock[order - 1]) + "]===");
                System.out.println("Purchased : " + items[order - 1] + "\nQty       : 1 (Recent Order " + (10 - stock[order - 1]) + ")\nPrice     :" + menuPrice[order - 1] + "$\nYour Money Remain Money :" + userMoney + "$");
            } else if (order == menuPrice.length + 1)
                System.out.println("Your Current Balanced : " + userMoney + "$");
            else if (order != menuPrice.length + 2 && userMoney.compareTo(menuPrice[0]) <= 0)
                System.out.println("\nError Something Wrong Please Check your Choice Or Balanced !!");
        } while (order != menuPrice.length + 2);

        System.out.println("Thank You Sir please come again !!!");
    }
}
