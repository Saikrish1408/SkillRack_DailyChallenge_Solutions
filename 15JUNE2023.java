import java.util.Scanner;

public class DailyChallenge150623 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String string1 = scannerObject.next();
        String string2 = scannerObject.next();
        for(int i = 0 ; i < string1.length() ; i++){
            if(i%2 == 0)
                System.out.print(string1.charAt(i));
            else    
                System.out.print(string2.charAt(i));
        }
        scannerObject.close();
    }
}
