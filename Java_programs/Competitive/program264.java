import java.util.*;

class program264
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Helmet;
        String License;
        String Overspeeding;

        int Amount = 0;

        System.out.println("Helmet worn :");
        Helmet = sobj.next();

        System.out.println("License available :");
        License = sobj.next();

        System.out.println("Overspeeding :");
        Overspeeding = sobj.next();

        if(Helmet.equalsIgnoreCase("NO"))
        {
            Amount = Amount + 500;
            
        }
        else if(License.equalsIgnoreCase("NO"))
        {
            Amount = Amount + 1000;
        }
        else if(Overspeeding.equalsIgnoreCase("YES"))
        {
            Amount = Amount + 1500;
        }
        else 
        {
            System.out.println("Total Fine Amount : "+Amount);
        }

        System.out.println("Total Fine Amount : "+Amount);

    }
}