#include <stdio.h>
#include <string.h>
int main()
{
    int n;
    scanf("%d",&n);
    char str[n][100];
    for(int i = 0 ; i < n ; i++)
    scanf("%s",str[i]);
    int con[n];
    
    for (int i = 0; i < n ; i++) 
    {
        int count = 0;
        for (int j = 0; j < strlen(str[i]); j++) 
        {
            if(str[i][j] != 'a' && str[i][j] != 'e' && str[i][j] != 'i' && str[i][j] != 'o' && str[i][j] != 'u'&& str[i][j] != 'A'&& str[i][j] != 'E'&& str[i][j] != 'I'&& str[i][j] != 'O'&& str[i][j] != 'U')
            count++;
        }
        con[i] = count;
    }
    int lar  = con[0], a = 0;
    for(int i = 1 ; i < n ; i++)
    {
        if(lar < con[i]){
        lar = con[i];
        a = i;
        }
    }
    printf("%s",str[a]);
    return 0;
}
