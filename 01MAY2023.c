#include <stdio.h>
int main()
{
    int n;
    int asterisk_operator = 1;
    scanf("%d",&n);
    for(int i = 1 ; i <= n ; i++)
    {
        int asterisk_flag = 0;
        int asterisk_operator1 = 1;
        char ch = 'a';
        int character_length = (n+1)-i;
        for(int j = 1 ; j <= ((n*2)+1) ; j++)
        {
            if(j <= character_length)
            {
                printf("%c ",ch++);
            }
            else if((character_length >= ((n+1)-i)) && (asterisk_operator1 <= asterisk_operator))
            {
                printf("* ");
                asterisk_operator1++;
                asterisk_flag = 1;
            }
            else if(character_length < (j-1) )
            {
                if((j-2) == character_length)
                ch--;
                printf("%c ",ch--);
            }
        }
        if(asterisk_flag == 1)
                asterisk_operator += 2;
        printf("\n");
    }

    return 0;
}

