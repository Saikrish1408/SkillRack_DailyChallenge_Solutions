import java.util.ArrayList;
import java.util.Scanner;

public class DailyTest220124 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.next();
        ArrayList<Character> vowelList = new ArrayList<>();
        for(int i = 0 ; i < inputString.length() ; i++) {
            char character = Character.toLowerCase(inputString.charAt(i));
            if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
                vowelList.add(inputString.charAt(i));
        }
        for(int forwardIterator = 0, backwardIterator = (vowelList.size() - 1) ;
            forwardIterator <= backwardIterator ; forwardIterator++, backwardIterator--) {
            System.out.print(vowelList.get(forwardIterator));
            if(forwardIterator != backwardIterator)
                System.out.print(vowelList.get(backwardIterator));
        }
        scannerObject.close();
    }
}
