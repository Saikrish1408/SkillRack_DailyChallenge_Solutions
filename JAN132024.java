import java.util.Scanner;

public class DailyTest130124 {
    public static String computeTheTestCases(int r, int c, char arr[][]) {
        boolean forwardPrinting = true;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < r ; i++) {
            int k = c - 1;
            for(int j = 0 ; j < c ; j++) {
                if (forwardPrinting) {
                    stringBuilder.append(arr[i][j]);
                    forwardPrinting = (j == (c - 1)) ? false : true;
                } else {
                    stringBuilder.append(arr[i][k]);
                    k--;
                    forwardPrinting = (j == (c - 1)) ? true : false;
                }
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int m = scannerObject.nextInt();
        char[][] arr = new char[n][m];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                arr[i][j] = scannerObject.next().charAt(0);
            }
        }
        System.out.println(computeTheTestCases(n, m, arr));

        scannerObject.close();
    }
}
