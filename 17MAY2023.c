#include <stdio.h>
#include <stdlib.h>
int main()
{
    int n, temp = 1, inc = 1, temp1 = 1;
    scanf("%d",&n);
    if(n >= 1)
    {
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n ; j++)
            {
                if(j <= i)
                    printf("%d ",temp++);
                else
                    printf("* ");
            }
            printf("\n");
        }   
    }
    if(n < 0)
    {
        for(int i = 1 ; i <= abs(n) ; i++)
        {
            int count = 1;
            for(int j = 1 ; count <= abs(n) ; j++, count++)
            {
                if((abs(n)-j) >= i)
                    printf("* ");
                else
                    printf("%d ",temp--);
            }
            printf("\n");
            inc++;
            temp1 += inc;
            temp = temp1;
        }
    }
    return 0;
}
