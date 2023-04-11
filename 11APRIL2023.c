#include <stdio.h>
int main()
{
    char character;
    int int_val;
    scanf("%c %d",&character,&int_val);
    if((character + int_val) <= 127)
    {
        for(char j = (character + int_val)-1 ; j >= character ; j--)
        {
            if(j >= 'a' && j <= 'z')
            printf("%c",j);
        }
    }
    else 
    {
        for(char j = 'z' ; j >= character ; j--)
        {
            printf("%c",j);
        }
    }
    return 0;
}
