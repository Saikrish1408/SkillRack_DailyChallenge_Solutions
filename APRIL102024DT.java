import java.util.Scanner;

public class DailyTest100424 {
    public static int dailyTest(int n) {
        int holes_count = 0;
        while(n > 0) {
            int rem = n % 10;
            if(rem == 1 || rem == 2 || rem == 3 || rem == 5 || rem == 7)
                holes_count += 0;
            else if(rem == 0 || rem == 4 || rem == 6 || rem == 9)
                holes_count += 1;
            else
                holes_count += 2;
            n /= 10;
        }
        return holes_count;
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        System.out.println(dailyTest(n));
        scannerObject.close();
    }
}
