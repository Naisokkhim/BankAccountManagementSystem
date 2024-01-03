import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please Enter Score : ");
        Scanner inputScore =  new Scanner(System.in);
        int Score = inputScore.nextInt();
        if(Score >= 100 ){
            System.out.println("A");
        }else if(Score >= 90 && Score <=80 ){
            System.out.println("B");
        }else if(Score >= 80 && Score <=70 ){
            System.out.println("C");
        }
        else if(Score >=70 && Score <=60 ){
            System.out.println("D");
        }
        else if(Score >= 60 && Score <=50 ){
            System.out.println("E");
        }
        else{
            System.out.println("F");
        }
    }



}