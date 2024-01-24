import java.util.Scanner;

public class DailyChallenge240124 {
    public static int countIfEqual(int n, int arr[][]) {
        int countOfEqual = 0;
        for(int i = 0 ; i < n ; i++) {
            int rowSum = 0, columnSum = 0;
            for(int j = 0 ; j < n  ; j++) {
                rowSum += (arr[i][j]);
            }
            for(int k = 0 ; k < n ; k++) {
                columnSum += (arr[k][i]);
            }
            if(rowSum == columnSum)
                countOfEqual++;
            System.out.println(i + " " + rowSum + " " + columnSum);
        }
        return countOfEqual;
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                arr[i][j] = scannerObject.nextInt();
            }
        }
        System.out.println(countIfEqual(n, arr));
        scannerObject.close();
    }
}
