import java.util.Scanner;

class program283
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int no = 0;
        int iDigit = 0, Add = 0, count = 0, iNo = 0;

        System.out.println("Enter Number :");
        no = sobj.nextInt();

        iNo = no;

        while(no != 0)
        {
            Add = 1;

            iDigit = no % 10;

            for(int i = 1; i <= iDigit; i++)
            {
                Add = i * Add;
            }

            count = Add + count;

            no = no / 10;
        }

        if(iNo == count)
        {
            System.out.println(iNo + " Is Strong number");
        }
        else
        {
            System.out.println(iNo + " Is not Strong number");
        }

    }
}