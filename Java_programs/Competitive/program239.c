#include<stdio.h>
#include<stdlib.h>
#include<io.h>
#include<fcntl.h>
#include<string.h>

#define BUFFERSIZE 100

int Size_File(char FName[])
{
    int iRet = 0;
    int fd = 0;
    int iSize = 0;

    char Buffer[BUFFERSIZE] = {'\0'};

    fd = open(FName, O_RDONLY);

    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        iSize = iSize + iRet;
    }

    close(fd);

    return iSize;
}

int main()
{
    char FileName[30];
    int iRet = 0;

    printf("Enter the file name : \n");
    scanf("%s",FileName);

    iRet = read_File(FileName);
    printf("File size is :%d",iRet);

    return 0;
}