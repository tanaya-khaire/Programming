#include<stdio.h>
#include<stdlib.h>
#include<io.h>
#include <fcntl.h>

void open_File(char FName[])
{
    int fd = 0;

    fd = open(FName,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("File Successfully open with fd : %d " ,fd);
    }
    
}

int main()
{
    char FileNmane[30];

    printf("Enter the file name :\n");
    scanf("%s",FileNmane);

    open_File(FileNmane);
}