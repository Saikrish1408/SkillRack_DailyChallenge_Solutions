import java.util.Scanner;

public class DailyChallenge170324 {
    public static void dailyChallenge(int n, int arr[]) {
        boolean found = false;
        for(int i = 0 ; i < n ; i++) {
            if((i+1)%2 != 0 && arr[i]%2 == 0) {
                System.out.print(arr[i] + " ");
                found = true;
            }
            else if ((i+1)%2 == 0 && arr[i]%2 != 0) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }
        if(!found)
            System.out.println("-1");
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        dailyChallenge(n, arr);
        scannerObject.close();
    }
}
