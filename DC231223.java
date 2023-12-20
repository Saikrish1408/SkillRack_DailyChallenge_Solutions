import java.util.Scanner;

public class DC201223 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.next();
        boolean palindromeFound = false;
        for(int i = 0 ; i < inputString.length()-2 ; i++) {
            StringBuffer stringBuffer =  new StringBuffer();
            stringBuffer.append(inputString.charAt(i));
            stringBuffer.append(inputString.charAt(i + 1));
            stringBuffer.append(inputString.charAt(i + 2));
            StringBuffer strBuffer = new StringBuffer(stringBuffer);
            stringBuffer = stringBuffer.reverse();
            String string1 = stringBuffer.toString();
            String string2 = strBuffer.toString();
            if(string1.equals(string2)) {
                palindromeFound = true;
                System.out.println(string2);
            }
        }
        if(!palindromeFound) {
            System.out.println("-1");
        }
        scannerObject.close();
    }
}
