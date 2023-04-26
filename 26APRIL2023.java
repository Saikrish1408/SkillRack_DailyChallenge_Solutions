import java.util.Scanner;

public class DailyChallengeToday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int flag = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            int int_value = Character.getNumericValue(str.charAt(i));
            if(int_value % 2 == 0)
                flag += 1;
        }    
        if(flag == str.length())
        System.out.println("Yes");
        else
        System.out.println("No");            
    }
}
