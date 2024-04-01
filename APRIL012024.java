import java.util.Scanner;

public class DailyTest010424 {
    public static void dailyTest(int n, int arr[][]) {
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(arr[i][j] == 0) {
                    if(i != (n - 1) && i != 0 && j != 0 && j != (n - 1)) { // Middle Elements of the Matrix
                        int sum = arr[i - 1][j] + arr[i + 1][j] + arr[i][j - 1] + arr[i][j + 1];
                        arr[i][j] = sum;
                        arr[i - 1][j] = arr[i + 1][j] = arr[i][j - 1] = arr[i][j + 1] = -1;
                    } // **** EDGE CASES ****
                    else if(i == 0 && j == 0) { // First Row First Element
                        int sum = arr[i][j+1] + arr[i+1][j];
                        arr[i][j] = sum;
                        arr[i][j+1] = arr[i+1][j] = -1;
                    } else if(i == 0 && j == (n-1)) { // First Row Last Element
                        int sum = arr[i][j-1] + arr[i+1][j];
                        arr[i][j] = sum;
                        arr[i][j-1] = arr[i+1][j] = -1;
                    } else if(i == 0 && j != 0 && j != (n - 1)) { // First Row Middle Elements
                        int sum = arr[i][j-1] + arr[i+1][j] + arr[i][j+1];
                        arr[i][j] = sum;
                        arr[i][j-1] = arr[i+1][j] = arr[i][j+1] = -1;
                    } else if(i != 0 && i != (n - 1) && j == 0) { // Middle Rows First Elements
                        int sum = arr[i+1][j] + arr[i-1][j] + arr[i][j+1];
                        arr[i][j] = sum;
                        arr[i-1][j] = arr[i+1][j] = arr[i][j+1] = -1;
                    } else if(i != 0 && i != (n - 1) && j == (n - 1)) { // Middle Rows Last Elements
                        int sum = arr[i+1][j] + arr[i][j-1] + arr[i-1][j];
                        arr[i][j] = sum;
                        arr[i][j-1] = arr[i+1][j] = arr[i-1][j] = -1;
                    } else if(i == (n - 1) && j == 0) { // Last Row First Element
                        int sum = arr[i][j+1] + arr[i-1][j];
                        arr[i][j] = sum;
                        arr[i][j+1] = arr[i-1][j] = -1;
                    } else if(i == (n - 1) && j == (n - 1)) {
                        int sum = arr[i-1][j] + arr[i][j-1];
                        arr[i][j] = sum;
                        arr[i-1][j] = arr[i][j-1] = -1;
                    } else if(i == (n - 1) && j != 0 && j != 0) {
                        int sum = arr[i][j-1] + arr[i][j+1] + arr[i-1][j];
                        arr[i][j] = sum;
                        arr[i-1][j] = arr[i][j-1]= arr[i][j+1] = -1;
                    }
                }
            }
        }
        for(int i[] : arr) {
            for(int j : i) {
                if(j == -1) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
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
        dailyTest(n, arr);
        scannerObject.close();
    }
}
