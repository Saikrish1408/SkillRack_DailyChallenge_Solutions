import java.util.Scanner;

public class DailyChallenge25042024 {
    public static void dailyChallenge(String string1, String string2) {
        if(string1.length() < string2.length()) {
            System.out.print(string1 + " ");
            for(int i = 0 ; i < string1.length() ; i++) {
                System.out.print(string2.charAt(i));
            }

        } else {
            for(int i = 0 ; i < string2.length() ; i++) {
                System.out.print(string1.charAt(i));
            }
            System.out.println(" " + string2);
        }
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String string1 = scannerObject.next();
        String string2 = scannerObject.next();
        dailyChallenge(string1, string2);
        scannerObject.close();
    }
}
