import java.util.ArrayList;
import java.util.Scanner;

public class DailyChallenege2607 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int N = scannerObject.nextInt();
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        ArrayList<Integer> compositeList = new ArrayList<Integer>();
        for(int i = 2 ; i <= N ; i++) {
            int flag = 0;
            for(int primeCheck = 2 ; primeCheck < i ; primeCheck++) {
                if(i%primeCheck == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                primeList.add(i);
            if(flag == 0) 
                compositeList.add(i);
        }
        for (Integer integer : compositeList) {
            System.out.print(integer + " ");
        }
        System.out.println();
        for (Integer integer : primeList) {
            System.out.print(integer + " ");
        }
        scannerObject.close();
    }
}
