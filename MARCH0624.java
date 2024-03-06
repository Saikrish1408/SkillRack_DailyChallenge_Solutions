import java.util.Scanner;

public class DailyTest060324 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        for(int i = 1 ; i <= n ; i++) {
            String binaryString = Integer.toBinaryString(i);
            System.out.println(binaryString + " ");
        }
        scannerObject.close();
    }
}
