import java.io.*;
import java.util.*;

class program247
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String Fname = null;

        System.out.println("Enter the file name :");
        Fname = sobj.nextLine();

        File fobj = new File(Fname);

        if(fobj.isFile())
        {
            System.out.println("It is a regular file");
        }
        else
        {
            System.out.println("It is a not regular file");
        }
    }
}