import java.util.*;

class program263
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Stock = 0;
        int Quantity = 0;
        int RemainingStock = 0;

        System.out.println("Enter Current Stock:");
        Stock = sobj.nextInt();

        System.out.println("Enter Requested Quantity:");
        Quantity = sobj.nextInt();

        // Validation

        if(Stock < 0)
        {
            System.out.println("Invalid Stock");
            return;
        }
        else if(Quantity <= 0)
        {
            System.out.println("Invalid Requested Quantity");
            return;
        }

        // Check Stock

        if(Quantity > Stock)
        {
            System.out.println("Order Failed: Insufficient Stock.");
            return;
        }
        else
        {
            RemainingStock = Stock - Quantity;

            System.out.println("Order Processed Successfully.");
            System.out.println("Remaining Stock: " + RemainingStock);

            if(RemainingStock < 5)
            {
                System.out.println("Low Stock Alert!");
            }
        }
    }
}