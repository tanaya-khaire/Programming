import java.util.*;

class program265
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Income = 0;
        int tax = 0;

        System.out.println("Enter Annual Income :");
        Income = sobj.nextInt();

        if(Income < 0)
        {
            System.out.println("Income cannot be negative");
            return;
        }

        if(Income <= 250000)
        {
            tax = 0;
        }
        else if(Income <= 500000)
        {
            tax = (Income - 250000) * 5 / 100;
        }
        else if(Income <= 1000000)
        {
            tax = 250000 * 5 / 100;
            tax = tax + (Income - 500000) * 20 / 100;
        }
        else
        {
            tax = 250000 * 5 / 100;
            tax = tax + 500000 * 20 / 100;
            tax = tax + (Income - 1000000) * 30 / 100;
        }

        System.out.println("Annual Income : " + Income);
        System.out.println("Total Tax Payable : " + tax);
    }
}