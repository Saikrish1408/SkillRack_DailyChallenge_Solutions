import java.util.Scanner;
import java.util.HashSet;

public class DailyTest290124 {
    public static void printingMissingAlphabets(String string1, String string2) {
        HashSet<Character> hashSet = new HashSet<>();
        for(int i = 0, j = 0 ; i < string1.length() || j < string2.length() ; i++, j++) {
            if(i < string1.length())
                hashSet.add(string1.charAt(i));
            if(j < string2.length())
                hashSet.add(string2.charAt(i));
        }
        if(hashSet.size() == 26) {
            System.out.print("-1");
        } else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (!hashSet.contains(ch))
                    System.out.print(ch + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String string1 = scannerObject.next();
        String string2 = scannerObject.next();
        printingMissingAlphabets(string1, string2);
        scannerObject.close();
    }
}
