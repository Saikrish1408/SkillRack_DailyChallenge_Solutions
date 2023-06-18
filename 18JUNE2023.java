import java.util.Scanner;

public class JUNE182023 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int rows = scannerObject.nextInt();
        int columns = scannerObject.nextInt();
        int arr1[][] = new int[rows][columns];
        int arr2[][] = new int[rows][columns];
        for(int i = 0 ; i < rows ; i++ ){
            for(int j = 0 ; j < columns ; j++){
                arr1[i][j] = scannerObject.nextInt();
            }
        }
        for(int i = 0 ; i < rows ; i++ ){
            for(int j = 0 ; j < columns ; j++){
                arr2[i][j] = scannerObject.nextInt();
            }
        }
        for(int rowIterator1 = 0 ; rowIterator1 < rows ; rowIterator1++){
            for(int columnIterator1 = 0 ; columnIterator1 < columns ; columnIterator1++){
                if(arr1[rowIterator1][columnIterator1] == arr2[rowIterator1][columnIterator1])
                    System.out.print(arr1[rowIterator1][columnIterator1] + " ");
                else 
                    System.out.print("*" + " ");
            }
            System.out.println();
        }
        scannerObject.close();
    }
}
