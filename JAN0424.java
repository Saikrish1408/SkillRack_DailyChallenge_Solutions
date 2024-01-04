import java.util.Scanner;

public class DC040424 {
    public static String dailyChallenge(String string, int X) {
        int countI = 1, countJ = 1;
        StringBuffer stringBufferFirst = new StringBuffer();
        StringBuffer stringBufferLast = new StringBuffer();
        for(int i = 0 , j = (string.length()-1) ; countI <= X && countJ <= X ; i++, j--) {
            stringBufferFirst.append(string.charAt(i));
            stringBufferLast.append(string.charAt(j));
            countI++;
            countJ++;
        }
        stringBufferLast.reverse();
        if(stringBufferFirst.toString().equals(stringBufferLast.toString())) {
            return "yes";
        }
        return "no";
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String string = scannerObject.next();
        int X = scannerObject.nextInt();
        System.out.println(dailyChallenge(string, X));
        scannerObject.close();
    }
}
