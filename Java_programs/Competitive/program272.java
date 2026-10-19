import java.util.Scanner;

class program272
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance, BookingHours, Age;
        int BaseFare = 0, ClassCharge = 0;

        String ClassType;

        System.out.println("Enter the travel distance :");
        Distance = sobj.nextInt();

        System.out.println("Enter the class type (Sleeper/3AC/2AC) :");
        ClassType = sobj.next();

        System.out.println("Enter the booking hours before :");
        BookingHours = sobj.nextInt();

        System.out.println("Enter passenger age :");
        Age = sobj.nextInt();

        if(Distance < 0 || BookingHours < 0 || Age < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        // Base Fare
        if(Distance <= 100)
        {
            BaseFare = 100;
        }
        else if(Distance <= 300)
        {
            BaseFare = 300;
        }
        else
        {
            BaseFare = 500;
        }

        // Class Charge
        if(ClassType.equalsIgnoreCase("Sleeper"))
        {
            ClassCharge = 100;
        }
        else if(ClassType.equalsIgnoreCase("3AC"))
        {
            ClassCharge = 300;
        }
        else if(ClassType.equalsIgnoreCase("2AC"))
        {
            ClassCharge = 500;
        }
        else
        {
            System.out.println("Invalid Class Type");
            return;
        }

        int Fare = BaseFare + ClassCharge;

        // Tatkal Charge
        if(BookingHours <= 24)
        {
            Fare = Fare + (Fare * 30 / 100);
        }

        // Senior Citizen Discount
        if(Age >= 60)
        {
            Fare = Fare - (Fare * 40 / 100);
        }

        System.out.println("Base Fare    : " + BaseFare);
        System.out.println("Class Charge : " + ClassCharge);
        System.out.println("Final Fare   : " + Fare);
    }
}