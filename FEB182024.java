import java.util.Scanner;

public class DailyTest18022024 {
    public static String presentOrNot(String numberString) {
        int sum = Character.getNumericValue(numberString.charAt(0));
        sum += Character.getNumericValue(numberString.charAt(2));
        if(numberString.contains(Integer.toString(sum))) {
            return "yes";
        }
        return "no";
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String numberString = scannerObject.next();
        System.out.println(presentOrNot(numberString));
        scannerObject.close();
    }
}
