import java.util.*;

class program266
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        int Amount = 50;
        String PeakHour;

        System.out.println("Enter the Distance :");
        Distance = sobj.nextInt();

        System.out.println("Enter Active Peak Hour :");
        PeakHour = sobj.next();

        if(Distance < 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        else if(Distance <= 10)
        {
            Amount = Amount + (Distance * 12);
        }
        else
        {
            Amount = Amount + (10 * 12) + (Distance - 10) * 15;
        }

        if(PeakHour.equalsIgnoreCase("YES"))
        {
            Amount = Amount + (Amount * 20 / 100);
        }

        System.out.println("Distance : " + Distance + " km");
        System.out.println("Peak Hour : " + PeakHour);
        System.out.println("Total Fare : ₹" + Amount);
    }
}