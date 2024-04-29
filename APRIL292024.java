import java.util.Scanner;

public class DailyChallenge29042024 {
    public static String ifHexadecimal(String string) {
        for(int i = 0 ; i < string.length() ; i++) {
            if((string.charAt(i) >= 'a' && string.charAt(i) <= 'f') ||
                    (string.charAt(i) >= 'A' && string.charAt(i) <= 'F') ||
                    (string.charAt(i) >= '0' && string.charAt(i) <= '9')) {
                continue;
            } else {
                return "no";
            }
        }
        return "yes";
    }
    public static void main(String[] args) {
        Scanner scannerOBject = new Scanner(System.in);
        String inputString = scannerOBject.next();
        System.out.println(ifHexadecimal(inputString));
        scannerOBject.close();
    }
}
