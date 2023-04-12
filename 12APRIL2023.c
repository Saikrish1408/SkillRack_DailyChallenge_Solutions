#include <stdio.h>
#include <string.h>
int main()
{
    int n;
    scanf("%d",&n);
    int num = n;
    static int j;
    for(int i = 1 ; i <= num ; i++)
    {
        int count = 0;
        if(i%2 != 0)
        {
            for ( j = n ; ; j--) 
            {
                printf("%d ",j);
                count++;
                if(count == num)
                {
                    printf("\n");
                    j = j + num;
                    n = j;
                    break;
                }
            }
        }
        if(i%2 == 0)
        {
            for( ; ; j++)
            {
                printf("%d ",j);
                count++;
                if(count == num)
                {
                    printf("\n");
                    j = j + num;
                    n = j;
                    break;
                }
            }
        }
    }
    return 0;
}
