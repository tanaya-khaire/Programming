#include<stdio.h>
#include<stdlib.h>
#include<io.h>
#include <fcntl.h>

#define BUFFERSIZE 100

void DisplayN(char FName[], int iNo)
{
    int fd = 0;
    int iRet = 0, iCount = 0, i = 0;

    char Buffer[BUFFERSIZE] = {'\0'};

    fd = open(FName, O_RDONLY);

    while((iRet = read(fd, Buffer, sizeof(Buffer))) != 0)
    {
        for(i = 0; i < iNo; i++)
        {
            printf("%c",Buffer[i]);
        } 
    }

    close(fd);
}

int main()
{
    char FileName[30];
    int iValue = 0;

    printf("Enter file name:\n");
    scanf("%s",FileName);

    printf("Enter the Number:\n");
    scanf("%d",&iValue);

    DisplayN(FileName,iValue);

    return 0;
}