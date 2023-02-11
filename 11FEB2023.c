#include <stdio.h>
#include <string.h>
int main()
{
    char s[100];
    int x;
    scanf("%s",s);
    scanf("%d",&x);
    int l = strlen(s);
    for(int i=0;i<=strlen(s)-1;i++)
    {
        if(i == (x-1))
        {
            printf("%c",s[i]);
            break;
        }
    }
    for(int i=strlen(s)-1;i>=0;i--)
    {
        if(i == (l-x))
        {
            printf("%c",s[i]);
            break;
        }  
    } 

    return 0;
}
