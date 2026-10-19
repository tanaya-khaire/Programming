import java.io.*;
import java.util.*;

class program249
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String Fname = null;

        System.out.println("Enter the file name");
        Fname = sobj.nextLine();

        FileInputStream fiobj = null;
        byte Buffer[] = new byte[100];
        int iRet = 0;
        int iSize = 0;

        File fobj = new File(Fname);

        if(fobj.exists())
        {
            System.out.println("File exists");

            fiobj = new FileInputStream(fobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                for(int i = 0; i < iRet; i++)
                {
                    iSize = iSize + Buffer[i];
                }
            }

            fiobj.close();
            
            System.out.println("Checksum of file is : " + iSize);
        }
        else
        {
            System.out.println("File does not exist");
        }

    }
}