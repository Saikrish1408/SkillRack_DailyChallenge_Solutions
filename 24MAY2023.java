import java.util.Scanner;

public class DailyChallenge2405{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char charr1[][] = new char[n][n];
        char charr2[][] = new char[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++)
            charr1[i][j] = input.next().charAt(0);
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++)
            charr2[i][j] = input.next().charAt(0);
        }
        int charr1VowelsCount = 0 , charr2VowelsCount = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                char ch = Character.toLowerCase(charr1[i][j]);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                charr1VowelsCount++;
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                char ch = Character.toLowerCase(charr2[i][j]);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                charr2VowelsCount++;
            }
        }
        if(charr1VowelsCount > charr2VowelsCount)
        {
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++)
                System.out.print(charr1[i][j] + " ");

                System.out.println();
            }
        }
        else if(charr1VowelsCount < charr2VowelsCount)
        {
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++)
                System.out.print(charr2[i][j] + " ");

                System.out.println();  
            }
        }
        else
        {
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++)
                System.out.print(charr1[i][j] + " ");

                System.out.println();
            }
        }
    }
}
