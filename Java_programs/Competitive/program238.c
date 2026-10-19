#include<stdio.h>
#include<stdlib.h>
#include<io.h>
#include<fcntl.h>
#include<string.h>

#define BUFFERSIZE 100

void read_File(char FName[])
{
    int iRet = 0;
    int fd = 0;

    char Buffer[BUFFERSIZE] = {'\0'};

    fd = open(FName, O_RDONLY);

    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        printf("%s",Buffer);
        memset(Buffer,'\0',sizeof(Buffer));
    }

    close(fd);
}

int main()
{
    char FileName[30];

    printf("Enter the file name : \n");
    scanf("%s",FileName);

    read_File(FileName);

    return 0;
}