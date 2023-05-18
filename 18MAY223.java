import java.util.Scanner;
public class DailyChallenge1805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), iterator = 0;
        String string = sc.next();
        for(int i = 1 ; i <= n ; i++)
        {
            for (int j = 1; j <= i ; j++) 
            {
                System.out.print(string.charAt(iterator));
                iterator++;
                if(iterator == (string.length()))
                    iterator = 0;
            }
            System.out.println();
        }
    }    
}
