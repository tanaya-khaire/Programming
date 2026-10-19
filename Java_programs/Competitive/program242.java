import java.io.*;
import java.util.*;

class program242
{
    public static void main(String A []) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String Fname = null;
        byte Buffer[] = new byte[100];
        int iRet = 0;
        
        System.out.println("Enter the file name :");
        Fname = sobj.nextLine();

        File fobj = new File(Fname);
        FileInputStream fiobj = null;

        if(fobj.exists())
        {
            fiobj = new FileInputStream(fobj);
            System.out.println("File open successfully");

            String str = null;

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                str = new String(Buffer,0,iRet);
                System.out.println(str);
                str = null;
            }
        }
        else
        {
            System.out.println("Unable to open file");
        }

        fiobj.close();
    }
}