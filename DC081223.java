import java.util.Scanner;

public class DC081223 {
    public static String toModifyString(String s1, String s2) {
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0 ; i < s2.length() ; i++) {
            if(s2.charAt(i) == 'u') {
                stringBuffer.append(Character.toUpperCase(s1.charAt(i)));
            } else {
                stringBuffer.append(Character.toLowerCase(s1.charAt(i)));
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String s1 = scannerObject.next();
        String s2 = scannerObject.next().toLowerCase();
        System.out.println(toModifyString(s1, s2));
        scannerObject.close();
    }
}
