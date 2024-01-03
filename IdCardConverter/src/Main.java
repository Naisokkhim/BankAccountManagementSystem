import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static String[] getInfo(String str){
        int partLength = 30 ;
        String[] part = new String[(str.length()+partLength-1)/partLength];
        for (int i =0 ; i < part.length;i++){
            int start = i * partLength;
            int stop = Math.min(start + partLength, str.length());
            part[i] = str.substring(start,stop);
        }
        Pattern Number = Pattern.compile("\\d+");
        Matcher Numbers = Number.matcher(part[0]);
        while (Numbers.find()){
            part[0]= Numbers.group();
        }
        int LastNameIndex = part[2].length() - 1;
        while (LastNameIndex >= 0 && !Character.isLetter(part[2].charAt(LastNameIndex))){
            LastNameIndex--;
        }
        String dob = part[1].substring(0,6);
        String ExpDate = part[1].substring(8,14);
        String DateFormat = String.format("%s/%s/%s", dob.substring(0, 2), dob.substring(2, 4), dob.substring(4, 6));
        String DateFormat1 = String.format("%s/%s/%s", ExpDate.substring(0, 2), ExpDate.substring(2, 4), ExpDate.substring(4, 6));
        System.out.println("ID :"+part[0].substring(0,9));
        System.out.println("dob :"+DateFormat);
        System.out.println("Sex :"+part[1].charAt(7));
        System.out.println("Expired :"+DateFormat1);
        System.out.println("First Name :"+part[2].substring(0,part[2].indexOf("<")));
        System.out.printf("Last Name :"+part[2].substring(part[2].indexOf("<")+2,LastNameIndex+1));
        return part;
    }
    public static void main(String[] args) {
        String str ="IDKHM1603633111<<<<<<<<<<<<<<<9501016M2406215KHM<<<<<<<<<<<6MEN<<CHENDA<<<<<<<<<<<<<<<<<<<";
        String[] Result = getInfo(str);
       // System.out.println(Arrays.toString(Result));
    }
}