import java.util.Scanner;

public class DailyChallenege1407 {
    public static void main(String[] args) {
        Scanner  scannerObject = new Scanner (System.in);
        String string = scannerObject.nextLine();
        for(int i = 0 ; i < string.length() ; i++) {
            if(string.charAt(i) == ' ') {
                System.out.println();
            }
            else {
                System.out.print(string.charAt(i));
            }
        }
        
    }
}
