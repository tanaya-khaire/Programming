import java.io.*;
import java.util.*;

class program243
{
    public static void main(String A []) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        String Fname = null;
        String Data = null;

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        System.out.println("Enter the file name");
        Fname = sobj.nextLine();

        System.out.println("Enter the data that you want to add in file");
        Data = sobj.nextLine();

        fobj = new File(Fname);

        byte Arr[] = Data.getBytes();

        if(fobj.exists())
        {
            fiobj = new FileInputStream(fobj);
            System.out.println("File successfully open");

            foobj = new FileOutputStream(fobj, true);
            foobj.write(Arr);

            foobj.close();

            System.out.println("Data writting successfully");
        }
        else
        {
            System.out.println("Unable to open the file");
        }
        
        fiobj.close();
        sobj.close();
    }
}