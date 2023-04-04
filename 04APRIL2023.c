#include <stdio.h>
int main()
{
    int number_of_elements,k,flag=0;
    scanf("%d",&number_of_elements);
    int array[number_of_elements];
    
    for(int i = 0 ; i < number_of_elements ; i++)
    scanf("%d",&array[i]);
    
    scanf("%d",&k);
    
    for(int i = 0 ; i < number_of_elements ; i++)
    {
        if(array[i] >= k)
        {
            flag = 1;
        }
        else
        {
        	printf("no");
        	return 0;
		}
    }
    if(flag == 1)
    printf("yes");
    
    return 0;
}
