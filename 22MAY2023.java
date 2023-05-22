import java.util.ArrayList;
import java.util.Scanner;
public class DailyChallenge2205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), count = 1;
        int y = sc.nextInt(), eveniterate = 0 , odditerate = 0;
        int n = sc.nextInt();
        ArrayList<Integer> evenArr  = new ArrayList<Integer>();
        ArrayList<Integer> oddArr  = new ArrayList<Integer>();
        for(int i = x ; count <= n ; i+=x, count++)
        evenArr.add(i);
        count = 1;
        for(int i = y ; count <= n ; i+=y, count++)
        oddArr.add(i);
        count = 1;
        for(int i = 0 ; count <= n ; i++, count++)
        {
            if(i%2 == 0)
            System.out.print(evenArr.get(eveniterate++) + " ");
            if(i%2 != 0)
            System.out.print(oddArr.get(odditerate++) + " ");
        }
    }    
}
