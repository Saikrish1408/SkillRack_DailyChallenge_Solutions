import java.util.Scanner;

public class DailyChallenge050424 {
    public static void dailyChallenge(int n, int[][] arr) {
        int rightDiagonalSum = 0, leftDiagonalSum = 0;
        for(int i = 0 ; i < n ; i++) {
            rightDiagonalSum += arr[i][i];
        }
        for(int i = 0 ; i < n ; i++) {
            int j = (n - 1 - i);
            leftDiagonalSum += arr[i][j];
        }
        System.out.println(leftDiagonalSum * rightDiagonalSum);
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                arr[i][j] = scannerObject.nextInt();
            }
        }
        dailyChallenge(n, arr);

        scannerObject.close();
    }
}
