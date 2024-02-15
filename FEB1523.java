import java.util.Scanner;

public class DailyChallenge150223 {
    public static String ifSorted(int arr[]) {
        boolean correctOrder = (arr[0] < arr[1]) ? true : false;
        for(int i = 0 ; i < (arr.length - 1) ; i++) {
            if(correctOrder) {
                if(arr[i] <= arr[i + 1]) {
                    continue;
                } else {
                    return "no";
                }
            } else if(!correctOrder) {
                if(arr[i] >= arr[i + 1]) {
                    continue;
                } else {
                    return "no";
                }
            }
        }
        return "yes";
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(ifSorted(arr));
        scannerObject.close();
    }
}
