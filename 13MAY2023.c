#include <stdio.h>
int main()
{
    int a, b, c, flag = 0;
    scanf("%d %d %d",&a,&b,&c);
    for(int i = a ; ; )
    {
        i = (i-b);
        if(i == c){
            flag = 1;
            printf("YES");
            break;
        }
        if(i < c)
        {
            printf("NO");
            return 0;
        }
    }

    return 0;
}
