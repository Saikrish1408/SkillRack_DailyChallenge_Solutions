#include <stdio.h>
#include <string.h>
#include <ctype.h>
int main()
{
    char string[1000];
    scanf("%s",string);
    
    int index=0,counter=0;
    
    while(string[index] != '\0')
    {
        string[index] = toupper(string[index]);
        if(string[index] == 'R')
        counter = 0;
        else if(string[index] == 'D')
        counter--;
        else if(string[index] == 'I')
        counter++;
        
        index++;
    }
    
    printf("%d",counter);

    return 0;
}
