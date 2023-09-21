import java.util.Scanner;

public class DailyChallenge21092023 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int N = scannerObject.nextInt();
        int arr[] = new int[N], minimum = 0;
        for(int i = 0 ; i < N ; i++) {
            arr[i] = scannerObject.nextInt();
            if(i == 0)
                minimum = arr[i];
            while((arr[i]%10) == 0) {
                arr[i] /= 10;
            }
        }
        for (int i : arr) {
            if(minimum > i)
                minimum = i;
        }
        System.out.println(minimum);
        scannerObject.close();
    }    
}
