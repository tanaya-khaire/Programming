import java.util.*;

class program260
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Amount = 0;
        int Discount = 0;
        int FinalAmount = 0;
        String Membership;

        System.out.println("Enter the Amount :");
        Amount = sobj.nextInt();

        System.out.println("Enter membership type (Premium/Regular):");
        Membership = sobj.next();

        if(Amount <= 0)
        {
            System.out.println("Invalid Amount");
            return;
        }

        if(!Membership.equalsIgnoreCase("Premium") &&
           !Membership.equalsIgnoreCase("Regular"))
        {
            System.out.println("Invalid Membership");
            return;
        }

        if(Amount > 5000)
        {
            Discount = Amount * 20 / 100;
        }
        else if(Amount > 2000)
        {
            Discount = Amount * 10 / 100;
        }
        else
        {
            Discount = 0;
        }

        FinalAmount = Amount - Discount;

        if(Membership.equalsIgnoreCase("Premium"))
        {
            int PremiumDiscount = FinalAmount * 5 / 100;

            Discount = Discount + PremiumDiscount;

            FinalAmount = FinalAmount - PremiumDiscount;
        }

        System.out.println("Original Amount: ₹" + Amount);
        System.out.println("Total Discount: ₹" + Discount);
        System.out.println("Final Payable Amount: ₹" + FinalAmount);

    }
}