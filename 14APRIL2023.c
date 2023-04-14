#include <stdio.h>
#include <string.h>
int main()
{
    char string[100];
    scanf("%s",string);
    int string_length = strlen(string);
    
    for (int i = 1; i <= string_length; i++) {
        if(string_length%i == 0)
        printf("%c",string[i-1]);
    }
    

    return 0;
}
