import java.util.Scanner;

class program284
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int no = 0;
        int iNo = 0, count = 0;
        int Armst = 0, temp = 0;

        System.out.println("Enter Number :");
        no = sobj.nextInt();

        iNo = no;
        temp = no;

        // Count digits
        while(temp != 0)
        {
            count++;
            temp = temp / 10;
        }

        while(no != 0)
        {
            int iDigit = no % 10;

            Armst = Armst + (int)Math.pow(iDigit, count);

            no = no / 10;
        }

        if(Armst == iNo)
        {
            System.out.println("This is Armstrong Number");
        }
        else
        {
            System.out.println("This is not Armstrong Number");
        }

        sobj.close();
    }
}