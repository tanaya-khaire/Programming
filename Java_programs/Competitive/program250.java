import java.io.*;
import java.util.*;

class program250
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;

        System.out.println("Enter the file name");
        FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("This is Directory");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files are :"+fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                System.out.println("File name is :" + fArr[i].getName());
                System.out.println("Size of file : " + fArr[i].length());
            }
        }
        else
        {
            System.out.println("This is no Directory");
        }

    }
}