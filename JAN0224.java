import java.util.Scanner;

public class DC020124 {
    public static void totalKElements(int n, int arr[], int k) {
        for(int i = 0 ; i < n-(k-1) ; i++) {
            int j = i, count = 1;
            int currentSum = 0;
            while(count <= k) {
                currentSum += arr[j];
                count++;
                j++;
            }
            System.out.print(currentSum + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        int k = scannerObject.nextInt();
        totalKElements(n, arr, k);
        scannerObject.close();
    }
}
