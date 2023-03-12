#include <stdio.h>
#include <ctype.h>
int main()
{
    char ch;
    scanf("%c",&ch);
    ch = tolower(ch);
    int stop = (int) ch;
    while(ch != 0)
    {
        
        if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
        {
            printf("%c",ch);
        }
        if(ch >= 122)
        {
            for(int i=97;i<stop;i++)
            {
                if((char)i != 'a' && (char)i != 'e' && (char)i != 'i' && (char)i != 'o' && (char)i != 'u')      
                printf("%c",(char)i);
            }
            break;
        }
        ch++;
        
    }

    return 0;
}
