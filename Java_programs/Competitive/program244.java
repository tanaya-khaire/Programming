import java.io.*;
import java.util.*;

class program244
{
    public static void main(String A []) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
       
        String Fname = null;
        File fobj = null;

        System.out.println("Enter the file name :");
        Fname = sobj.nextLine();

        fobj = new File(Fname);

        if(fobj.exists())
        {
            System.out.println("This file is already present");
        }
        else
        {
            fobj.createNewFile();
            System.out.println("File create successfully");
        }

        sobj.close();
    }
}