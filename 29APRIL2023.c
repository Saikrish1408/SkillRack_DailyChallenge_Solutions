#include <stdio.h>
#include <stdlib.h>
int main()
{
    int number_of_elements,k_element;
    scanf("%d",&number_of_elements);
    int arr[number_of_elements];
    for(int iterator = 0 ; iterator < number_of_elements ; iterator++)
    scanf("%d",&arr[iterator]);

    scanf("%d",&k_element);
    
    for(int iterator = 0 ; iterator < number_of_elements ; iterator++)
    {
        if(iterator >= (number_of_elements-k_element))
        {
            if(arr[iterator] > 0)
            printf("-%d ",arr[iterator]);
            else if(arr[iterator] < 0)
            printf("%d ",abs(arr[iterator]));
        }
        else
        printf("%d ",arr[iterator]);
    }
    return 0;
}
