#include <stdio.h>
int main()
{
    
    int n,flag=0;
    scanf("%d",&n);
    int a[n];
    
    for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
    
    for(int i=0;i<n;i+=2)
    {
        if(a[i] != a[i+1])
            flag = 1;
        else if(a[i] == a[i+1])
        {
            flag = 0;
            break;
        }
    }
    if(flag == 1)
    printf("%s","yes");
    else if(flag == 0)
    printf("%s","no");
    return 0;
}
