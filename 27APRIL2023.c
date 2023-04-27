#include <stdio.h>
int main()
{
    int n,x,y,z,count=0;
    scanf("%d %d %d %d",&n,&x,&y,&z);
    for(int i = 1 ; count < n ; i++)
    {
        if(i%x == 0 && i%y != 0 && i%z != 0)
        {
            printf("%d ",i);
            count++;
        }
        else if(i%x != 0 && i%y == 0 && i%z != 0)
        {
            printf("%d ",i);
            count++;
        }
        else if(i%x != 0 && i%y != 0 && i%z == 0)
        {
            printf("%d ",i);
            count++;
        }
    }
    return 0;
}


