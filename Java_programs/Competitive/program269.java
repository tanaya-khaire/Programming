import java.util.*;

class program269
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int budget = 0;
        int N = 0;
        int price = 0;
        int count = 0;

        System.out.println("Enter your budget :");
        budget = sobj.nextInt();

        if(budget < 0 )
        {
            System.out.println("Invalid Budget");
            return;
        }

        System.out.println("Enter the number of items :");
        N = sobj.nextInt();

        if(N < 0)
        {
            System.out.println("Invalid Number of Items");
            return;
        }

        for(int i = 1; i < N; i++)
        {
            System.out.println("Enter the price of items :");
            price = sobj.nextInt();

            if(price < 0)
            {
                System.out.println("Invalid Price");
                return;
            }

            if(price <= budget)
            {
                budget = price - budget;
                count++;
            }
            else
            {
                break;
            }

            System.out.println("Items Purchased : " + count);
            System.out.println("Remaining Balance : ₹" + budget);
        }
    }  
}