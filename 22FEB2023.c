#include <stdio.h>
#include <string.h>
int main()
{
    char s[1000];
    
    scanf("%s",s);
    int i=0;
    
    for(int i=0;i<strlen(s);i++)
    {
        int limit = (int) s[i];
        for(int j=0;j<limit-96;j++)
        printf("%c",s[i]);
        
        printf("\n");
    }
    return 0;
}
