import java.util.Scanner;

class program285
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Perfect = 0;

        System.out.println("Enter number :");
        int no = sobj.nextInt();

        for(int i = 1; i < no; i++)
        {
            if(no % i == 0)
            {
                Perfect = Perfect + i;
            }
        }

        if(Perfect == no)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }
    }
}