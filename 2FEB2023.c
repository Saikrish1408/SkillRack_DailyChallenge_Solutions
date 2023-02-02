#include <stdio.h>
int main()
{
    int number_of_elements,x;
    scanf("%d %d",&number_of_elements,&x);
    int array_variable[number_of_elements];
    for(int index = 0;index<number_of_elements;index++)
    scanf("%d",&array_variable[index]);
    
    int count = 0;
    
    for(int index = (number_of_elements-1);count < x;index--)
    {
        printf("%d",array_variable[index]);
        count++;
    }

    return 0;
}
