import java.util.Scanner;
import java.util.ArrayList;

public class DailyChallenge1405 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int testCases = n, count = 1, flag = 0;
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        while(count <= testCases)
        {
            flag = 0;
            char ch = input.next().charAt(0);
            int  integer = input.nextInt();
            if(ch == '+')
            arrList.add(integer);
            else if(ch == '-')
            arrList.remove(Integer.valueOf(integer));
            else if(ch == '?')
            {
                if(integer == 1)
                {
                    for(int i = 0 ; i < arrList.size() ; i++)
                    {
                        if(arrList.get(i) % 2 != 0){
                            System.out.print(arrList.get(i) + " ");
                            flag = 1;
                        }
                    }
                    if(flag == 1)
                        System.out.println();
                    else if(flag == 0)
                        System.out.println("-1");

                    count++;
                    continue;
                }
                else if(integer == 0)
                {
                    for(int i = 0 ; i < arrList.size() ; i++)
                    {
                        if(arrList.get(i) % 2 == 0)
                        {
                            System.out.print(arrList.get(i) + " ");
                            flag = 1;
                        }        
                    }
                    if(flag == 1)
                        System.out.println();
                    else if(flag == 0)
                        System.out.println("-1");

                    count++;
                    continue;
                }
            }
            count++;
        }
    }    
}
