import java.util.Scanner;

public class DC010124 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int starInsideSlashCount = (n-1),starOutsideSlash = 0;
        for(int i = 1 ;  ;i++) {
            int printingStartCount = 0;
            for(int j = 1 ; j <= n ; j++) {
                if(i == 1) {
                    System.out.print("_");
                } else {
                    if(j == 1 && i == 2) {
                        System.out.print("\\");
                    }
                    else if(i > 2 && j == 1) {
                        for(int k = 1 ; k <= starOutsideSlash ; k++) {
                            System.out.print("*");
                        }
                        System.out.print("\\");
                    }
                    else {
                        System.out.print("*");
                        printingStartCount++;
                        if(printingStartCount == starInsideSlashCount) {
                            break;
                        }
                    }
                }
            }
            if(i > 1) {
                starInsideSlashCount-=2;
                starOutsideSlash++;
                System.out.print("/");
            }
            System.out.println();
            if(starInsideSlashCount == 0) {
                for(int j = 1 ; j <= starOutsideSlash ; j++)
                    System.out.print("*");

                System.out.print("\\/");
                break;
            }
        }
    }
}
