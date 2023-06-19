import java.util.Scanner;

public class DailyChallenge210623 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n1 = scannerObject.nextInt();
        int n2 = scannerObject.nextInt(), flag = 0;
        for(int i = 2 ; i <= n2 ; i++) {
            if(n1%i == 0 && n2%i == 0) {
                System.out.print(i);
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("-1");
    }
}
