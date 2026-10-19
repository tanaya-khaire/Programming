import java.util.Scanner;

class program287
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int sum = 0, iDigit = 0, temp = 0, Revr = 0;

        System.out.println("Enter number :");
        int no = sobj.nextInt();

        temp = no;

        while(no != 0)
        {
            iDigit = no % 10;

            Revr =  (Revr * 10) + iDigit;

            no = no / 10;
        }

        if(temp == Revr)
        {
            System.out.println("Palindrom Number");
        }
        else
        {
            System.out.println("Not Palindrom Number");
        }
    }
}