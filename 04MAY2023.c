import java.util.Scanner;

public class CountOfConsonants 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String string = input.next();
        int count = 0;
        string = string.toLowerCase();
        for (int i = 0; i < string.length()-1 ; i++) 
        {
            // string.charAt(i).toLowerCase();
            if(string.charAt(i) != 'a' && string.charAt(i) != 'e' && string.charAt(i) != 'i' && string.charAt(i) != 'o' && string.charAt(i) != 'u' )
            {
                if(string.charAt(i+1) != 'a' && string.charAt(i+1) != 'e' && string.charAt(i+1) != 'i' && string.charAt(i+1) != 'o' && string.charAt(i+1) != 'u')
                {
                    count++;
                }
            }    
        }
        System.out.println(count);
    }    
}
