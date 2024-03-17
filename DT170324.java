import java.util.Scanner;

public class DailyTest170324 {
    public static void dailyTest(int n) {
        int limit = 1, j = 1;
        for(int i = 1 ; i <= n ; i++) {
            int count = 1;
            for( ; count <= limit ; j++, count++) {
                if(j <= n)
                    System.out.print(j + " ");
                if(j == n && count == limit)
                    System.exit(0);
                else if(j > n && count <= limit){
                    System.out.print("*" + " ");
                    if(count == limit)
                        System.exit(0);
                }
            }
            System.out.println();
            limit = (i == 1) ? limit + 1 : limit * 2;
        }
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        dailyTest(n);
        scannerObject.close();
    }
}
