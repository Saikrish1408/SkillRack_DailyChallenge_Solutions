#include<stdio.h>
#include<string.h>
int main()
{
	char str[100];
	scanf("%s",str);
	int vowel = 0, cons = 0;
	for(int i = 0 ; i < strlen(str) ; i++)
	{
		if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
		vowel++;
		else if(str[i] != 'a' && str[i] != 'e' && str[i] != 'i' && str[i] != 'o' && str[i] != 'u')
		cons++;
	} 
	if(vowel > cons)
	{
		for(int i = 0 ; i < strlen(str) ; i++)
		{
			if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
				printf("%c",str[i]);
		}
	}
	else if(cons > vowel)
	{
		for(int i = 0 ; i < strlen(str) ; i++)
		{
			if(str[i] != 'a' && str[i] != 'e' && str[i] != 'i' && str[i] != 'o' && str[i] != 'u')
				printf("%c",str[i]);
		}
	}
	else
	{
		for(int i = 0 ; i < strlen(str) ; i++)
		printf("%c",str[i]);
	}
}
