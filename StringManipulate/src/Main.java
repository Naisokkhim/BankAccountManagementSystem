import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String UserSentence = userInput.nextLine();
        int userChoice ;
        do {
            System.out.print("\t\t1. Count the number of characters in the sentence.\n" +
                    "        2. Count the number of words in the sentence.\n" +
                    "        3. Convert the sentence to uppercase.\n" +
                    "        4. Convert the sentence to lowercase\n\t\t5. Exit");
            System.out.println("\nPlease make a choice :");

            userChoice = userInput.nextInt();
            if (userChoice == 1 ){
                System.out.println("the number of characters in the sentence is "+UserSentence.length());
            }
            else if (userChoice == 2){
                String[] word = UserSentence.split(" ");
                System.out.println("the number of words in the sentence is "+word.length);
            }
            else if (userChoice == 3){
                System.out.println("Convert To Uppercase : "+UserSentence.toUpperCase());
            }else if (userChoice == 4){
                System.out.println("Convert To Uppercase : "+UserSentence.toLowerCase());
            }
        }while (userChoice !=5);

    }
}