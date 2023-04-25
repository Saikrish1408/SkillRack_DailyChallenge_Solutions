#include <stdio.h>
#include <string.h>
int main()
{
    char str[100];
    scanf("%s\n",str);
    int n;
    scanf("%d",&n);
    for(int i = strlen(str)-1 ; i > -1 ; i--)
    {
        if((i+1)%n == 0)
        printf("%c",str[i]);
    }
    return 0;
}
