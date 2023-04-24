#include <stdio.h>
int main()
{
    int n,k;
    scanf("%d %d",&n,&k);
    int k_unit_digit = k%10;
    int a[n];
    for (int i = 0; i < n; i++)
        scanf("%d",&a[i]);
    for(int i = 0 ; i < n ; i++)
    {
        int unit_digit = a[i]%10;
        if(unit_digit == k_unit_digit)
        printf("%d ",a[i]+k);
        else
        printf("%d ",a[i]-k);
    }
    

    return 0;
}
