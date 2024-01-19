import com.sun.jdi.IntegerValue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String date ;
        System.out.println("Enter Year-Month-Day :");date = input.nextLine();
        System.out.println(date);
        String year = date.substring(0,4);
        String month = date.substring(5,7);
        String day = date.substring(8,10);
        int NumMonth = Integer.valueOf(month);
        String MonthConvert = "";
        if (NumMonth == 1) {
            MonthConvert = "January";
        } else if (NumMonth == 2) {
            MonthConvert = "February";
        } else if (NumMonth == 3) {
            MonthConvert = "March";
        } else if (NumMonth == 4) {
            MonthConvert = "April";
        } else if (NumMonth == 5) {
            MonthConvert = "May";
        } else if (NumMonth == 6) {
            MonthConvert = "June";
        } else if (NumMonth == 7) {
            MonthConvert = "July";
        } else if (NumMonth == 8) {
            MonthConvert = "August";
        } else if (NumMonth == 9) {
            MonthConvert = "September";
        } else if (NumMonth == 10) {
            MonthConvert = "October";
        } else if (NumMonth == 11) {
            MonthConvert = "November";
        } else if (NumMonth == 12) {
            MonthConvert = "December";
        } else {
            MonthConvert = "Invalid month number";
        }

        System.out.println(MonthConvert+" "+day+","+year);

    }
}