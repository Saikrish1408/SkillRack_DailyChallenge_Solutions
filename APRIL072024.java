import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class DailyChallenge070424 {
    public static void dailyChallenge(int n, int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int position = 1;
        for(int i : arr) {
            hashMap.put(i, position++);
        }
        Arrays.sort(arr);
        for(int i : arr) {
            System.out.print(hashMap.get(i) +  " ");
        }
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        dailyChallenge(n, arr);
        scannerObject.close();
    }
}
