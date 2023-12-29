import java.util.Scanner;

public class DC291223 {
    public static void functionToModify(int[][] arr, int row, int column) {
        int middleRow = row / 2;
        int middleColumn = column / 2;
        for(int i = 0 ; i < row ; i++) {
            for(int j = 0 ; j < column ; j++) {
                if(i == middleRow) {
                    System.out.print("+ ");
                } else if(j == middleColumn){
                    System.out.print("+ ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int r = scannerObject.nextInt();
        int c = scannerObject.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                arr[i][j] = scannerObject.nextInt();
            }
        }
        functionToModify(arr, r, c);
        scannerObject.close();
    }
}
