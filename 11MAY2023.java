import java.util.Scanner;
public class DailyChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            int temp = i, odd_count = 0, digit_count = 0;
            while (temp > 0) 
            {
                int rem = temp % 10;
                    digit_count++;;
                temp /= 10;
            }    
            temp = i;
            while (temp > 0) 
            {
                int rem = temp % 10;
                if(rem % 2 != 0)
                    odd_count++;
                temp /= 10;
            }
            if(digit_count == odd_count)
            System.out.print(i + " ");
        }
    }
}
