import java.io.*;
import java.util.*;

class program252
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the folder name :");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Folder exists");
            
            FileOutputStream foobj = null;

            File fArr[] = fobj.listFiles();

            System.out.println("Enter the file name that You want to copy :");
            String NewFile = sobj.nextLine();

            File NewFile1 = new File(NewFile);
            NewFile1.createNewFile();

            foobj = new FileOutputStream(NewFile1);

            for(int i = 0; i < fArr.length; i++)
            {
                foobj.write(fArr[i].getName().getBytes());

                System.out.println(" ");
            }

            System.out.println("Successfully copy file names ");
        }

    }
}