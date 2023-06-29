import java.util.Scanner;

public class DailyChallenge2905 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int numberOfCharacter = scannerObject.nextInt();
        char[] characterArray = new char[numberOfCharacter];
        for (int i = 0; i < numberOfCharacter; i++) {
            characterArray[i] = scannerObject.next().charAt(0);
        }
        for(int i = (numberOfCharacter-1) ; i > -1 ; i--) {
            if(characterArray[i] >= 'a' && characterArray[i] <= 'z')
                System.out.print(((int)characterArray[i] - 96) + " ");
            else if(characterArray[i] >= 'A' && characterArray[i] <= 'Z')
                System.out.print(((int)characterArray[i] - 64) + " ");
        }    
        scannerObject.close();
        
    }
}
