#include <stdio.h>
int main()
{
    char string[100];
    scanf("%s",string);
    int i=0,count=0;
    while(string[i] != '\0')
    {
        if(string[i] >= 'a' && string[i] <= 'z')
        {
            i++;
            continue;
        }
        if(string[i] >= 'A' && string[i] <= 'Z')
        {
            i++;
            continue;
        }
        if(string[i] >= '0' && string[i] <= '9')
        {
            i++;
            continue;
        }
        else
        {
            count++;
            i++;
        }
    }
    printf("%d",count);

    return 0;
}
