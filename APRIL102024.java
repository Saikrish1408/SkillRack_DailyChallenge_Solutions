import java.util.Scanner;

public class DailyChallenge100424 {
    public static void dailyChallenge(int n, int[] arr) {
        int minimumValue = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++) {
            if(i == 0) {
                minimumValue = arr[i];
                System.out.print(minimumValue + " ");
            } else {
                if(arr[i] < minimumValue) {
                    minimumValue = arr[i];
                    System.out.print(minimumValue + " ");
                } else {
                    System.out.print(minimumValue + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        dailyChallenge(n, arr);
        scannerObject.close();
    }
}
