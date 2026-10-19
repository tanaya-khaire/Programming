import java.util.Scanner;

class program276
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int days = 0;
        int amount = 0;

        System.out.println("Enter number of days stayed : ");
        days = sobj.nextInt();

        if(days < 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        
        amount = days * 3000;
    
        if(days > 7)
        {
            amount = amount - (amount * 5 / 100);
        }

        System.out.println("Total Stay Duration : "+days);
        System.out.println("Final Bill Amount : "+amount);
    }
}