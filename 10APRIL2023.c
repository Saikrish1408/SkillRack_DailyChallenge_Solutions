#include <stdio.h>
#include <string.h>
int main()
{
    char str[100];
    scanf("%s",str);
    int flag = 0;
    
    for (int i = 0; i < strlen(str) ; i++) 
    {
        if(str[i] == str[i+1] && str[i+1] == str[i+2])
        {
            flag = 1;
            break;   
        }
    }
    
    if(flag == 1)
    printf("invalid");
    else if(flag == 0)
    printf("valid");
    

    return 0;
}
