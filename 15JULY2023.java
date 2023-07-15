import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class DailyChallenege1507 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int numberOfStrings = scannerObject.nextInt();
        String inputStrings[] = new String[numberOfStrings];
        for(int i = 0 ; i < numberOfStrings ; i++) {
            inputStrings[i] = scannerObject.next();
        }
        //Sorting the strings with the help of Comparator function by passing an argument 
        //which tells the compiler that we are comparing String object with the help of its respective object Length
        Arrays.sort(inputStrings, Comparator.comparingInt(String::length));
        for(int i = 0 ; i < inputStrings.length ; i++) 
            System.out.println(inputStrings[i]);
        
        scannerObject.close();
    }    
}
