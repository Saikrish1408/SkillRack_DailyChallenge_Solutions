import java.util.Scanner;

public class DailyChallenge120124 {
    public static int computeTheTestCases(int n, int arr[], int x, int y) {
        int sum = 0;
        for(int i : arr) {
            sum += (i >= x && i <= y) ? i : 0;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        int x = scannerObject.nextInt();
        int y = scannerObject.nextInt();
        System.out.println(computeTheTestCases(n, arr, x, y));
        scannerObject.close();
    }
}
