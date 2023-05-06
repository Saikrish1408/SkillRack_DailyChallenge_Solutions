import java.util.Scanner;
public class MAY06DailyChallenge 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int SmallFlag = 0, LargeFlag = 0;
        for (int i = 0; i < string.length(); i++) 
        {
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u')
                SmallFlag = 1;
            if(string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U')
                LargeFlag = 1;
        }    
        if(SmallFlag == 1 && LargeFlag == 1)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
