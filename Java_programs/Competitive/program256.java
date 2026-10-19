import java.util.*;

class program256
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int iDay = 0;
        int iFine = 0;

        System.out.println("Enter total number of days the book was kept :");
        iDay = sobj.nextInt();

        if(iDay <= 7)
        {
            System.out.println("Book return on time no fine applicable ");
        }
        else if(iDay >= 8 && iDay <= 12)
        {
            System.out.println("Fine applicable because you keep the book more than 7 days");

            iFine = (iDay - 7) * 5;

            System.out.println("Total fine :" + iFine + " rupees");
        }
        else
        {
            System.out.println("more Fine applicable because you keep the book out of time period");

            iFine = 25 + (iDay - 12) * 10;

            System.out.println("Total fine :" + iFine + " rupees");
        }
    }
}