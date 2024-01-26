// Edge Cases


import java.util.Scanner;

public class DailyChallenge260124 {
    public static void printSurroundingElementsOfN(int r, int c, int arr[][], int n) {
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                if(arr[i][j] == n) {
                    // Whether the n is j == 0
                    if(i == 0 && j == 0) {
                        System.out.print(arr[i][j + 1] + " " + arr[i + 1][j] + " " + arr[i + 1][j + 1]);
                    } else if(i == (r - 1) && j == 0) {
                        System.out.print(arr[i - 1][j] + " " + arr[i - 1][j + 1] + " " + arr[i][j + 1]);
                    } else if(i != 0 && i != (r - 1) && j == 0) {
                        System.out.print(arr[i - 1][j] + " " + arr[i - 1][j + 1] + " " + arr[i][j + 1]
                                + " " + arr[i + 1][j] + " " + arr[i + 1][j + 1]);
                    }
                    // Whether the n is j == (c - 1)
                    else if(i == 0 && j == (c - 1)) {
                        System.out.print(arr[i][j - 1] + " " + arr[i + 1][j - 1] + " " + arr[i + 1][j]);
                    } else if(i == (r - 1) && j == (c - 1)) {
                        System.out.print(arr[i - 1][j - 1] + " " + arr[i - 1][j] + " " + arr[i][j - 1]);
                    } else if(i != 0 && i != (r - 1) && (j == (c - 1))) {
                        System.out.print(arr[i - 1][j - 1] + " " + arr[i - 1][j] + " " + arr[i][j - 1] + " "
                                + arr[i + 1][j - 1] + " " + arr[i + 1][j]);
                    }
                    // Whether the n present in between columns and rows
                    else if(i != 0 && i != (r - 1) && j != 0 && j != (c - 1)) {
                        System.out.print(arr[i - 1][j - 1] + " " + arr[i - 1][j] + " " + arr[i - 1][j + 1]
                            + " " + arr[i][j - 1] + " " + arr[i][j + 1] + " " + arr[i + 1][j - 1]
                                + " " + arr[i + 1][j] + " " + arr[i + 1][j + 1]);
                    }
                    // Whether the n present in the middle row and middle column ()
                    else if(i != 0 && i == (r - 1) && j != 0 && j != (c - 1)) {
                        System.out.print(arr[i - 1][j - 1] + " " + arr[i - 1][j] + " " + arr[i - 1][j + 1]
                              + " "+ arr[i][j - 1] + " " + arr[i][j + 1]);
                    }
                    // Whether the n present in between columns and rows
                    else if(i == 0 && j != 0 && j != (c - 1)) {
                        System.out.print(arr[i][j - 1] + " " + arr[i][j + 1] + " " + arr[i + 1][j - 1]
                                + " "+ arr[i + 1][j] + " " + arr[i + 1][j + 1]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int r = scannerObject.nextInt();
        int c = scannerObject.nextInt();
        int arr[][] = new int[r][c];
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                arr[i][j] = scannerObject.nextInt();
            }
        }
        int n = scannerObject.nextInt();
        printSurroundingElementsOfN(r, c, arr, n);
        scannerObject.close();
    }
}
