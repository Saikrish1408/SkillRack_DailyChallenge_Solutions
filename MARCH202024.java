import java.util.Scanner;
import java.util.HashSet;

public class DailyChallenge200324 {
    public static String dailyChallenge(int n, int k, int arr[]) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0 ; i < n ; i++) {
            if(hashSet.contains(k - arr[i])) {
                return "yes";
            }
            hashSet.add(arr[i]);
        }
        return "no";
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int k = scannerObject.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        System.out.println(dailyChallenge(n, k, arr));
        scannerObject.close();
    }
}
