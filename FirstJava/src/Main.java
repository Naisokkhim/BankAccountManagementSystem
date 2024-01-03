import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int password = 1234;

        System.out.println("Please Enter name : ");
        String userName = userInput.nextLine();

        System.out.println("Please Enter password : ");
        String userPassStr = userInput.nextLine();
        if (userPassStr.isEmpty()) {
            System.out.println("You must enter a password!");
        } else {
            try {
                int userPass = Integer.parseInt(userPassStr);
                if(userPass == password){
                    System.out.println("Hello  "+ userName);
                } else {
                    System.out.println("Wrong password !");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid password format!");
            }
        }

        userInput.close();
    }
}
