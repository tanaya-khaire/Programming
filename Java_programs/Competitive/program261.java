import java.util.*;

class program261
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int ParkingHours = 0;
        int Amount = 0;

        System.out.println("Enter Parking Duration :");
        ParkingHours = sobj.nextInt();

        if(ParkingHours < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(ParkingHours <= 2)
        {
            Amount = ParkingHours * 20;
        }
        else if(ParkingHours <= 10)
        {
            Amount = (ParkingHours * 20) + ((ParkingHours - 2) * 10);
        }
        else 
        {
            Amount = (ParkingHours * 20) + ((ParkingHours - 2) * 10) + 50;
        }

        System.out.println("Total Parking Duration : "+ParkingHours);
        System.out.println("Total Parking Fee : "+Amount);
    }
}