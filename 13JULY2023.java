import java.util.Scanner;

public class DailyChallenege1307 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n1 = scannerObject.nextInt();
        int n2 = scannerObject.nextInt();
        for(int i = n1 ; i <= n2 ; i++) {
            if(((i%10) + (i/10)%10)%2 == 0)
                System.out.print(i + " ");
        }
        scannerObject.close();
    }
}
