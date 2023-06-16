import java.util.Scanner;

public class JUNE162023 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int rows = scannerObject.nextInt();
        int columns = scannerObject.nextInt();
        int array[][] = new int[rows][columns];
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                array[i][j] = scannerObject.nextInt();
            }
        }
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < columns ; j++)
            {
                System.out.print(checkIfPrime(array[i][j]) + " ");        
            }
            System.out.println();
        }
        scannerObject.close();        
    }
    public static int checkIfPrime(int n){
        for(int i = 2 ; i < n ; i++){
            if(n%i == 0){
                return 0;
            }
        }
        return 1;
     }
}
