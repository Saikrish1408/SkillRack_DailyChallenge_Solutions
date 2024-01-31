import java.util.Scanner;

public class DailyTest310124 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int end = n;
        for(int i = 1 ; i <= n ; i++, end--) {
            long sum = 0, multiplication = 1;
            for(int j = 1 ; j <= end ; j++) {
                if(i % 2 != 0) {
                    sum += j;
                    if(j < end) {
                        System.out.print(j + "+");
                    } else if(j == end) {
                        System.out.print(j + "=" + sum);
                    }
                } else {multiplication *= j;
                    if(j < end) {
                        System.out.print(j + "*");
                    } else if (j == end) {
                        System.out.print(j + "=" + multiplication);
                    }
                }
            }
            System.out.println();
        }
        scannerObject.close();
    }
}
