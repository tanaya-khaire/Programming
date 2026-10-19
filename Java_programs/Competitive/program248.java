import java.io.*;
import java.util.*;

class program248
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String  NewFolder = null;

        System.out.println("Enter the folder name :");
        NewFolder = sobj.nextLine();

        File fobj = new File(NewFolder);

        if(fobj.mkdir())
        {
            System.out.println("Folder is create is successfully");
        }
        else
        {
            System.out.println("Unable to create folder");
        }
    }
}