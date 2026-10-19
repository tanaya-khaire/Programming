import java.util.Scanner;

class program290
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int sum = 0, product = 1, temp = 0, iDigit = 0;

        System.out.println("Enter number :");
        int no = sobj.nextInt();

        while(no != 0)
        {
            iDigit = no % 10;

            if(iDigit == 0)
            {
                iDigit = 1;
            }

            sum = iDigit + sum;

            product = product * iDigit;

            no = no / 10;
        }

        if(sum == product)
        {
            System.out.println("Spy number");
        }
        else
        {
            System.out.println("Not spy number");
        }
    }
}