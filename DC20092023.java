import java.util.Scanner;

public class DailyChallenge2009 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int N = scannerObject.nextInt(), jRowCondition = N;
        for(int i = 0 ; i < N ; i++, jRowCondition++) {
            int jCount = 1;
            for(int j = 1 ; jCount <= jRowCondition ; jCount++, j++) {
                if(j == (i + 1) && i != 0) {
                    for(int k = 1; k <= (i + 1) ; k++){
                        System.out.print(j + " ");
                        jCount++;
                    }
                    jCount -= 1;
                }   
                else
                    System.out.print(j + " ");
            }
            System.out.println();
        }
        scannerObject.close();
    }
}
