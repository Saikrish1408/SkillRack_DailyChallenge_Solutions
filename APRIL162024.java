import java.util.Scanner;

public class DailyChallenge16042024 {
    public static String dailyChallenge(String string) {
        for(int i = 0 ; i < string.length() ; i++) {
            if(!(string.charAt(i) == 'x' || string.charAt(i) == 'X' || string.charAt(i) == 'y' || string.charAt(i) == 'Y')) {
                return "no";
            }
        }
        return "yes";
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String input_string = scannerObject.next();
        System.out.println(dailyChallenge(input_string));
        scannerObject.close();
    }
}
