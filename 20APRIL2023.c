#include <stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int a[n];
    for (int i = 0; i < n; i++)
        scanf("%d",&a[i]);
    
    if(n%2 == 0)
    {
        int count = 1 , start = (n-4);
        int arrambikilam_ah = (start/2);
        for(int i = arrambikilam_ah ; count <= 4 ; i++,count++)
            printf("%d ",a[i]);
    }
    else if(n%2 != 0)
    {
        int count = 1 ,start = (n-3);
        int arrambikilam_ah = (start/2);
        for(int i = arrambikilam_ah ; count <= 3 ; i++, count++)
            printf("%d ",a[i]);
    }
    return 0;
}

