#include <stdio.h>
#include <stdlib.h>
int main()
{
    int number_of_elements,sum=0;
    scanf("%d",&number_of_elements);
    int array[number_of_elements];
    
    for(int index = 0; index < number_of_elements ;index++)
    scanf("%d",&array[index]);
    
    for(int index = 0; index < number_of_elements ;index++)
    {
        sum += abs(array[index]);
    }
    
    printf("%d",sum);
    return 0;
}
