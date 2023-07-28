#include <stdio.h>
int main()
{
    int n;
    static int j;
    scanf("%d",&n);
    for(int i = 1 ; i <= n ; i++) {
        j = i;
        int count = 1;
        for( ; count <= n ; j+=i, count++) {
            printf("%d ",j);
        }
        printf("\n");
    }
    return 0;
}
