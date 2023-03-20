#include <stdio.h>
#include <string.h>
int main()
{
    char s1[100],s2[100];
    int n;
    scanf("%s",s1);
    scanf("%s",s2);
    scanf("%d",&n);
    int len = strlen(s2)-n;
    int count = 1;
    for (int i = 0; i < n; i++) 
    {
        printf("%c",s1[i]);
    }
    for (int i = len; count <= n; i++) 
    {
        printf("%c",s2[i]);
        count++;
    }
    
    // printf("%d",len);

    return 0;
}
