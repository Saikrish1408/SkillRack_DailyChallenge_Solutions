import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DailyTest21032024 {
    public static int dailyTest(int n, int arr[]) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i : arr) {
            if(hashMap.containsKey(i)) {
                int value = hashMap.get(i);
                hashMap.put(i, ++value);
            } else {
                hashMap.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(dailyTest(n, arr));
        scannerObject.close();
    }
}
