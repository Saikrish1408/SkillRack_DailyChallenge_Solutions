import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DailyChallenege2705 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), j;
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        ArrayList<Integer> arrOrdered = new ArrayList<Integer>();
        for(int i = 1 ; i <= n ; i++)
            arrOrdered.add(i);

        for(int i = 0 ; i < n ; i++)
        {
            int flag = 0;
            for(j = 0 ; j < n ; j++)
            {
                if(arr[j] == arrOrdered.get(i)) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
            System.out.print(arrOrdered.get(i) + " ");
        }
    }
}
