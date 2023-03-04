#include <stdio.h>
int main()
{
    int start = 1,sum=0;
    while(start)
    {
        int a,b;
        scanf("%d %d",&a,&b);
        sum += (a+b);
        if(a!=b)
        break;
    }
    
    printf("%d",sum);
    

    return 0;
}
