import java.util.Scanner;

public class DailyTest16042024 {
    public static int dailyTest(String string) {
        int lowercase_count = 0, uppercase_count = 0;
        for(int i = 0 ; i < string.length() ; i++) {
            if(Character.isLowerCase(string.charAt(i))) {
                lowercase_count++;
            } else if(Character.isUpperCase(string.charAt(i))) {
                uppercase_count++;
            }
        }
        return (lowercase_count <= uppercase_count) ? lowercase_count : uppercase_count;
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String input_string = scannerObject.next();
        System.out.println(dailyTest(input_string));
        scannerObject.close();
    }
}
