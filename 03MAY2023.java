import java.util.Scanner;

public class DailyChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  str = input.next();
        int len = (str.length())/2,flag = 0;
        for (int i = len; i < str.length(); i++) 
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
                {
                    System.out.print(str.charAt(i));
                    flag = 1;
                }
        }   
        for (int i = 0; i < len; i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'  || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
                {
                    System.out.print(str.charAt(i));
                    flag = 1;
                }
        }
        if(flag == 0)
            System.out.println("-1");
    }    
}   
