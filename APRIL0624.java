import java.util.Scanner;

public class DailyChallenge060424 {
    public static String dailyChallenge(int r, int c, int[][] arr, int k) {
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                if(i == 0 || i == (r - 1)) {
                    if(arr[i][j] != k) {
                        return "no";
                    }
                } else if(j == 0 || j == (c - 1)) {
                    if(arr[i][j] != k) {
                        return "no";
                    }
                }
            }
        }
        return "yes";
    }
    public static void main(String[] args) {
        Scanner scannerOBject = new Scanner(System.in);
        int r = scannerOBject.nextInt();
        int c = scannerOBject.nextInt();
        int[][] arr = new int[r][c];
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                arr[i][j] = scannerOBject.nextInt();
            }
        }
        int k = scannerOBject.nextInt();
        System.out.println(dailyChallenge(r, c, arr, k));;
        scannerOBject.close();
    }
}
