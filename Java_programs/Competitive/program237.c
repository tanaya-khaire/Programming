#include<stdio.h>
#include<stdlib.h>
#include<io.h>
#include<fcntl.h>

void Create_File(char FName[])
{
    int fd = 0;

    fd = creat(FName,0777);

    if (fd == -1)
    {
        printf("Unable to create file \n");
    }
    else
    {
        printf("File create successesfully with fd :%d",fd);
    }
}

int main()
{
    char FileName[30];

    printf("Enter the file name : \n");
    scanf("%s",FileName);

    Create_File(FileName);

    return 0;
}