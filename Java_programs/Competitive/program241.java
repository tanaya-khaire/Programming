import java.io.*;
import java.util.*;

class program241
{
    public static void main(String A [] ) throws Exception
    {
        Scanner sobj = null;
        String Fname = null;
        
        sobj = new Scanner(System.in);

        FileInputStream fiobj = null;

        System.out.println("Enter the file name ");
        Fname = sobj.nextLine();

        try
        {
            fiobj = new FileInputStream(Fname);
            System.out.println("File successfully opened");
        }
        catch(IOException Eiobj)
        {
            System.out.println(Eiobj);
        }
        
        if(fiobj != null)
        {
            fiobj.close();
            System.out.println("File successfully closed ");
        }
    }
}