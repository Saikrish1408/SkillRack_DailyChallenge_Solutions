import java.util.Scanner;

public class DailyChallenge2605 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String string = scannerObject.next();
        char character = scannerObject.next().charAt(0);
        int stringLength = string.length()-1;
        for(int i = 0 ; i < string.length()-1 ; i++) {
            if(string.charAt(i) == character) {
                for(int j = (i+1) ; j < string.length() ; j++) {
                    char currentCharacter = Character.toLowerCase(string.charAt(j));
                    if(currentCharacter == 'a' || currentCharacter == 'e' || currentCharacter == 'i' || currentCharacter == 'o' || currentCharacter == 'u') {
                        System.out.print(string.charAt(j));
                        break;
                    }
                    if(j == (string.length()-1))
                        System.out.print(string.charAt(i));
                }
            }
            else {
                System.out.print(string.charAt(i));
            }
        }   
        if(string.charAt(stringLength) != 'a' && string.charAt(stringLength) != 'e' && string.charAt(stringLength) != 'i' && string.charAt(stringLength) != 'o' && string.charAt(stringLength) != 'u') {
            System.out.print(string.charAt(stringLength));
        }
        scannerObject.close();
    }
}
