import java.util.Scanner;

class program286
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int sum = 0, iDigit = 0, temp = 0;

        System.out.println("Enter number :");
        int no = sobj.nextInt();

        temp = no;

        while(no != 0)
        {
            iDigit = no % 10;

            sum = sum + iDigit;

            no = no / 10;
        }

        if(temp % sum == 0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }
    }
}