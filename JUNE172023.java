import java.util.Scanner;

public class JUNE172023 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String string = scannerObject.nextLine();
        int allowPannugaBro = 0, doesItHaveVowel = 0;
        for(int i = 0 ; i < (string.length()-1) ; i++)
        {
            int stopTheInnerLoop = 0;
            if(allowPannugaBro == 1){
                System.out.print(string.charAt(i));
                allowPannugaBro = 0;
                doesItHaveVowel = 1;
                continue;
            }
            char currentCharacter = Character.toLowerCase(string.charAt(i));
            if(currentCharacter != 'a' && currentCharacter != 'e' && currentCharacter != 'i' && currentCharacter != 'o' && currentCharacter != 'u')
            {
                for(int vowelIteration = (i+1) ; (vowelIteration < string.length()) && (stopTheInnerLoop == 0) ; vowelIteration++){
                    char vowelIterationCharacters = Character.toLowerCase(string.charAt(vowelIteration));
                    if(vowelIterationCharacters == 'a' || vowelIterationCharacters == 'e' || vowelIterationCharacters == 'i' || vowelIterationCharacters == 'o' || vowelIterationCharacters == 'u'){
                        System.out.print(string.charAt(vowelIteration));
                        doesItHaveVowel = 1;
                        stopTheInnerLoop = 1;
                    }
                }
            }
            if(currentCharacter == 'a' || currentCharacter == 'e' || currentCharacter == 'i' || currentCharacter == 'u' || currentCharacter == 'o'){
                System.out.print(currentCharacter);
            }
        }
        if(doesItHaveVowel == 0)
            System.out.println("-1");

        scannerObject.close();
    }
}
