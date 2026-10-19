import java.util.*;

class program259
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Unit = 0;
        int Amount = 0;

        System.out.println("Enter electricity unit consumed:");
        Unit = sobj.nextInt();

        if(Unit < 0)
        {
            System.out.println("Invalid units");
            return;
        }

        if(Unit <= 100)
        {
            Amount = Unit * 5;
        }
        else if(Unit <= 200)
        {
            Amount = (100 * 5) + ((Unit - 100) * 7);
        }
        else
        {
            Amount = (100 * 5) + (100 * 7) + ((Unit - 200) * 10);
        }

        System.out.println("Total Units Consumed : " + Unit);
        System.out.println("Total Electricity Bill : Rupees " + Amount);
    }
}