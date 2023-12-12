import java.util.Scanner;

public class DC121223 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt(), sum = 0;
        for(int i = 1 ; i <= n ; i++) {
            int number = scannerObject.nextInt();
            if(number%2 == 0)
                sum += (number * 2);
            else
                sum += (number * 4);
        }
        System.out.println(sum);
        scannerObject.close();
    }
}
