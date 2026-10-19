import java.util.*;

class program257
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int Balance = 0;
        int withdraw = 0;
        int RemingBalance = 0;

        System.out.println("Enter the your balance :");
        Balance = sobj.nextInt();

        System.out.println("Enter the withdraw amount :");
        withdraw = sobj.nextInt();

        if(Balance < 0 || withdraw <= 0)
        {
            System.out.println("Invalid Input");
        }
        else if(withdraw % 100 != 0)
        {
            System.out.println("Transaction Failed: Amount must be a multiple of 100");
        }
        else if(withdraw > 25000)
        {
            System.out.println("Transaction Failed: Maximum withdrawal is 25000");
        }
        else if(Balance - withdraw < 1000)
        {
            System.out.println("Transaction Failed: Minimum balance must be 1000");
        }
        else
        {
            RemingBalance = Balance - withdraw;

            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance: " + RemingBalance);
         }
    }
}