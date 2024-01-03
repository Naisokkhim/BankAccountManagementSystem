public class Main {
    public static String trimTheString(String cut) {
        return cut.substring(cut.indexOf(":")+1).trim();
    }
    public static void main(String[] args) {
        String str1= "idNumber: 160363311";
        String Results = trimTheString(str1);
        System.out.println("str 1 = "+Results);
        }
}
