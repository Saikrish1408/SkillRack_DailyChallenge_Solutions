import java.util.Scanner;

public class DailyChallenge14052024 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        System.out.println(alternativeOddOrEven(n, arr, arr[0]%2 == 0, arr[0]%2 != 0));
        scannerObject.close();
    }

    public static String alternativeOddOrEven(int n, int[] arr, boolean isEven, boolean isOdd) {
        for(int i : arr) {
            if((i % 2 == 0) && (isEven) && (!isOdd)) {
                isEven = false;
                isOdd = true;
            } else if ((i % 2 != 0) && (!isEven) && (isOdd)) {
                isEven = true;
                isOdd = false;
            } else {
                return "no";
            }
        }
        return "yes";
    }
}
