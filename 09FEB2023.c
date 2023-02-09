#include <stdio.h>
int main()
{
    int number_of_elements, temporary_variable;
    scanf("%d",&number_of_elements);
    int array[number_of_elements];
    
    for(int i=0;i<number_of_elements;i++)
    scanf("%d",&array[i]);
    
    
    
    for(int i=0;i<number_of_elements;i+=3)
    {
        temporary_variable = array[i];
        array[i] = array[i+2];
        array[i+2] = temporary_variable;
    }
    
    for(int i=0;i<number_of_elements;i++)
    printf("%d ",array[i]);
    
}

