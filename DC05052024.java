import java.util.Scanner;

public class DailyChallenge05052024 {
    public static String findTriplets(int n, int[] arr) {
        int squarredArray[] = new int[n];
        int iterator = 0;
        for(int i = 0 ; i < n ; i++) {
            squarredArray[iterator++] = arr[i] * arr[i];
        }
        for(int i = 0 ; i < n ; i++) {
            int a = arr[i] * arr[i];
            for(int j = (i + 1) ; j < n ; j++) {
                int b = arr[j] * arr[j];
                if((a + b) == findElement((a + b), squarredArray)) {
                    return "yes";
                }
            }
        }
        return "no";
    }

    public static int findElement(int sum, int[] squarredArray) {
        for (int j : squarredArray) {
            if (j == sum) {
                return sum;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(findTriplets(n, arr));
        scannerObject.close();
    }
}
