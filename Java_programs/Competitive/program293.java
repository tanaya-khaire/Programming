import java.util.Scanner;

class program293
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int no = sobj.nextInt();

        int cube = no * no * no;
        int temp = no;
        int divisor = 1;

        // Find 10^number of digits
        while(temp != 0)
        {
            divisor = divisor * 10;
            temp = temp / 10;
        }

        // Check whether cube ends with original number
        if(cube % divisor == no)
        {
            System.out.println("Trimorphic Number");
        }
        else
        {
            System.out.println("Not Trimorphic Number");
        }

        sobj.close();
    }
}