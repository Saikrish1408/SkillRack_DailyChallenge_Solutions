import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class DailyChallenge1505 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0, oddCount = 0;
        int number_of_elements = sc.nextInt();
        int arr[] = new int[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 != 0)
            oddCount++;
            else if(arr[i] % 2 == 0)
            evenCount++;
        }
        if(evenCount > oddCount)
        {
            for (int i = (number_of_elements-1); i > -1; i--) {
                if(arr[i]%2 == 0)
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < number_of_elements; i++) {
                if(arr[i]%2 != 0)
                System.out.print(arr[i] + " ");
            }
        }
        else if(oddCount > evenCount)
        {
            for (int i = (number_of_elements-1); i > -1; i--) {
                if(arr[i]%2 != 0)
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < number_of_elements; i++) {
                if(arr[i]%2 == 0)
                System.out.print(arr[i] + " ");
            }
        }
        else if(oddCount == evenCount)
        {
            for(int i = (number_of_elements-1) ; i > -1 ; i--)
            System.out.print(arr[i] + " ");
        }
    }
}
