import java.util.Scanner;

class program288
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Squar = 0, iDigit = 0, sum = 0;

        System.out.println("Enter number :");
        int no = sobj.nextInt();

        Squar = no * no;

        while(Squar != 0)
        {
            iDigit = Squar % 10;

            sum = sum + iDigit;

            Squar = Squar / 10;
        }

        if(no == sum)
        {
            System.out.println("Neon number");
        }
        else
        {
            System.out.println("Not Neon number");
        }
        
    }
}