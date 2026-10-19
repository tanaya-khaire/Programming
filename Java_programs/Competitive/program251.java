import java.io.*;
import java.util.*;

class program251
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the folder name :");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        FileInputStream fiobj;

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Folder is exists");

            File FArr[] = fobj.listFiles();
            
            System.out.println("Bellow files contain this folder :");
            
            for(int i = 0; i < FArr.length; i++)
            {
                System.out.println(FArr[i]);
            }

        }
        else
        {
            System.out.println("This is not folder");
        }
    }
}