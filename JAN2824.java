import java.util.Scanner;

public class DailyChallenge280124 {
    public static String maxAlphabets(String string1, String string2, char ch) {
        int string1_Occurence = 0, string2_Occurence = 0;
        for(int i = 0, j = 0 ; i < string1.length() || j < string2.length() ; i++, j++) {
            if((i <= string1.length() - 1) &&(string1.charAt(i) == ch))
                string1_Occurence++;
            if((j <= string2.length() - 1) && (string2.charAt(j) == ch))
                string2_Occurence++;
        }
        if(string1_Occurence >= string2_Occurence)
            return string1;
        else
            return string2;
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString1 = scannerObject.next();
        String inputString2 = scannerObject.next();
        char ch = scannerObject.next().charAt(0);
        System.out.println(maxAlphabets(inputString1, inputString2, ch));
        scannerObject.close();
    }
}
