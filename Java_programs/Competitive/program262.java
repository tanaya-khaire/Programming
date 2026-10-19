import java.util.*;

class program262
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;
        int Income = 0;
        int CreditScore = 0;
        String Check;

        System.out.println("Enter the Age :");
        Age = sobj.nextInt();

        System.out.println("Enter your monthly income :");
        Income = sobj.nextInt();

        System.out.println("Enter your Credit score :");
        CreditScore = sobj.nextInt();

        System.out.println("Do you have any existing unpaid loan? (Yes/No):");
        Check = sobj.next();

        // Validation

        if(Age < 21 || Age > 60)
        {
            System.out.println("This age is not eligible for loan");
            return;
        }
        else if(Income < 25000)
        {
            System.out.println("Not eligible because your income is low");
            return;
        }
        else if(CreditScore < 700)
        {
            System.out.println("Not eligible because Credit Score is LOW");
            return;
        }
        else if(!Check.equalsIgnoreCase("Yes") &&
                !Check.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid Input. Enter Yes or No");
            return;
        }
        else if(Check.equalsIgnoreCase("Yes"))
        {
            System.out.println("Not eligible because current loan is ongoing");
            return;
        }
        else
        {
            System.out.println("Eligible for loan");
        }
    }
}