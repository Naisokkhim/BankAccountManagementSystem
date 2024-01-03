import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("please enter number to find out Odd or Even :");
        int num =inputNumber.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

    }
}