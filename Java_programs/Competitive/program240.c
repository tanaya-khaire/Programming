#include<stdio.h>
#include<stdlib.h>
#include<io.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 100

void WriteString(char FName[], char Str[])
{
    int fd = 0;

    fd = open(FName, O_WRONLY | O_APPEND);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return;
    }

    write(fd, Str, strlen(Str));

    close(fd);
}

int main()
{
    char FileName[30];
    char Buffer[BUFFER_SIZE];

    printf("Enter file name : ");
    scanf("%s", FileName);

    printf("Enter string : ");
    scanf(" %[^\n]", Buffer);

    WriteString(FileName, Buffer);

    printf("String written successfully.\n");

    return 0;
}