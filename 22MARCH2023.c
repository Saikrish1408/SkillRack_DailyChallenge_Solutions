#include <stdio.h>
int main()
{
    int r,c;
    scanf("%d %d",&r,&c);
    
    int a[r][c];
    
    for(int i = 0 ; i < r ; i++)
    {
        for(int j = 0 ; j < c ; j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    
    for(int i = 0 ; i < r ; i++)
    {
        for(int j = 0 ; j < c ; j++)
        {
            if(i == 0 && j == 0)
            printf("%d ",a[i][j]);
            else if(i == 0 && j == (c-1))
            printf("%d ",a[i][j]);
            else if(i == (r-1) && j == 0)
            printf("%d ",a[i][j]);
            else if(i == (r-1) && j == (c-1))
            printf("%d ",a[i][j]);
        }
        
    }

    return 0;
}
