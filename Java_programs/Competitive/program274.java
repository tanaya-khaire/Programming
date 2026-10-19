import java.util.Scanner;

class program274
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int units = 0;
        int WeeksLate = 0;
        int amount = 0;
        int lateFee = 0;

        System.out.println("Enter the units : ");
        units = sobj.nextInt();

        System.out.println("Enter the weeks after u payment : ");
        WeeksLate = sobj.nextInt();

        if(units < 0 || WeeksLate < 0)
        {
            System.out.println("Invalid Input :");
            return;
        }

        //slab logic

        if(units <= 100)
        {
            amount = units * 2;
        }
        else if(units <= 200)
        {
           amount = (100 * 2) + ((units - 100) * 3);
        }
        else
        {
            amount = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }

        // Fixed meter charge
        amount = amount + 50;

        if(WeeksLate > 0)
        {
            int penaltyPercent = WeeksLate * 2;

            if(penaltyPercent > 10)
            {
                penaltyPercent = 10;
            }

            lateFee = amount * penaltyPercent / 100;

            amount = amount + lateFee;
        }

        System.out.println("Bill Amount : ₹" + amount);

    }
}