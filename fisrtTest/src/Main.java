import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner userInput = new Scanner(System.in);

       System.out.print("Please chose Converter 1(F to C),2(C to F) :");
       byte userPick = userInput.nextByte();
       if(userPick ==  1){
           System.out.println("Please input number of F :");
           int f = userInput.nextInt();
           int c = (f - 32)*5/9;
           System.out.println("Celsius to Fahrenheit is :"+c);
       }
       else
       {
           System.out.println("Please input number of C :");
           int c = userInput.nextInt();
           int f = (c* 9/ 5) + 32;
           System.out.println("Celsius to Fahrenheit is :"+f);

       }


    }
}