#include <stdio.h>
int main()
{
    int n,x;
    scanf("%d",&n);
    int a[n];
    
    for(int i = 0 ; i < n ; i++)
    scanf("%d",&a[i]);
    
    scanf("%d",&x);
    
    for(int i = 0 ; i < n ; i++)
    {
        if(a[i] % 2 == 0)
        a[i] += x;
        else if(a[i] % 2 != 0)
        a[i] = a[i] - x;
    }
    
    for(int i = 0 ; i < n ; i++)
    printf("%d ",a[i]);

    return 0;
}
