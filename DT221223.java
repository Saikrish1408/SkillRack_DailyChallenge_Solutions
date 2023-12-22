import java.security.spec.RSAOtherPrimeInfo;
import java.util.Locale;
import java.util.Scanner;

public class DT221223 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String input = scannerObject.next().toLowerCase(Locale.ROOT);
        int numberOfVowels = 0, numberOfConsonants = 0;
        for(int i = 0 ; i < input.length() ; i++) {
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                numberOfVowels++;
            } else {
                numberOfConsonants++;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        int toPrintVowelCount = 1, toPrintConsonantCount = 1;
        for(int i = 0 ; i  < input.length() ; i++) {
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                stringBuffer.append(input.charAt(i));
            } else {
                stringBuffer.append(toPrintConsonantCount++);
            }
        }
        for(int i = stringBuffer.length()-1 ; i  > -1 ; i--) {
            if(stringBuffer.charAt(i) == 'a' || stringBuffer.charAt(i) == 'e' || stringBuffer.charAt(i) == 'i' || stringBuffer.charAt(i) == 'o' || stringBuffer.charAt(i) == 'u') {
                String ch = Integer.toString(toPrintVowelCount);
                stringBuffer.replace(i, i + 1, ch);
                toPrintVowelCount++;
            }
        }
        scannerObject.close();
    }
}
