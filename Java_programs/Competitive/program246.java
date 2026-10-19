import java.io.*;
import java.util.*;

class program246
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        String Fname = null;
        String NewFile = null;

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        byte Buffer[] = new byte[100];

        System.out.println("Enter the file that you want to open :");
        Fname = sobj.nextLine();

        System.out.println("Enter the file name for creating :");
        NewFile = sobj.nextLine();

        File fobj = new File(Fname);

        if(fobj.exists())
        {
            fiobj = new FileInputStream(fobj);

            File fobjNewFile = new File(NewFile);

            foobj = new FileOutputStream(fobjNewFile);

            if(fobjNewFile.exists())
            {
                System.out.println("File is created successfully");
            }
            else
            {
                System.out.println("Cannot create new file");
            }

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer, 0, iRet);
            }

            System.out.println("Data transfer is successful");

            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}