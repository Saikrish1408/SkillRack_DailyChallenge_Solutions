import java.util.Scanner;

public class DailyTest17022024 {
    public static int longestPalindromicString(int n, String stringArray[]) {
        int longestPalindromicStringLength = -1;
        for(String stringIterator : stringArray) {
            StringBuffer stringBuffer = new StringBuffer(stringIterator);
            if(stringBuffer.reverse().toString().equals(stringIterator)) {
                longestPalindromicStringLength = (stringIterator.length() > longestPalindromicStringLength) ?
                        stringIterator.length() : longestPalindromicStringLength;
            }
        }
        return longestPalindromicStringLength;
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        String stringArray[] = new String[n];
        for(int i = 0 ; i < n ; i++)
            stringArray[i] = scannerObject.next();
        System.out.println(longestPalindromicString(n, stringArray));;
        scannerObject.close();
    }
}
