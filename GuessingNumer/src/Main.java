import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("====Guessing by Number Game====");
        System.out.println("We have Number Rang 0 to 50 \n");
        Scanner userInput = new Scanner(System.in);

        Random random = new Random();
        int max = 50,min = 0;
        int count = 0;
        int randomNumber = random.nextInt(max - min + 1) + min;
        int guessingNumber;
        do {
            System.out.println("Make a guess :");
            guessingNumber = userInput.nextInt();
        if (guessingNumber > randomNumber)
        {
            System.out.println("Too high !!!");
            count +=1;

        }
        else if (guessingNumber < randomNumber)
        {
            System.out.println("Too low !!!");
            count +=1;


        }
        }while (guessingNumber != randomNumber);
        System.out.println("yay!!! You win !!!\n You Try  "+count+" time to Guessed number "+randomNumber);

    }
}
