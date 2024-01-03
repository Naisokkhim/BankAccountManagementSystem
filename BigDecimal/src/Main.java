import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputDecimal = new Scanner(System.in);
        System.out.println("BigDecimal 1 :");
        BigDecimal BigNum1 = inputDecimal.nextBigDecimal();
        System.out.println("BigDecimal 2 :");
        BigDecimal BigNum2 = inputDecimal.nextBigDecimal();
        System.out.println("Operator { + , - , * , / } : ");
        String inputOperator = inputDecimal.next();
        switch (inputOperator){
            case "+" :
                System.out.println("Result : " + BigNum1.add(BigNum2));
                break;
            case "-" :
                System.out.println("Result : " + BigNum1.subtract(BigNum2));
                break;
            case "/" :
                if(BigNum1.compareTo(BigDecimal.ZERO) == 0){
                    System.out.println("You cannot divide by 0");
                    break;
                }else{
                    System.out.println("Result : "+BigNum1.divide(BigNum2, MathContext.DECIMAL64));
                    break;
                }
            case "*" :
                if(BigNum1.compareTo(BigDecimal.ZERO)== 0 || BigNum2.compareTo(BigDecimal.ZERO) == 0){
                    System.out.println("Result : O ");
                    break;
                }else{
                    System.out.println("Result : "+ BigNum1.multiply(BigNum2));
                    break;
                }
        }
        inputDecimal.close();
    }

}