import java.util.Scanner;

class program292
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int no = sobj.nextInt();

        int original = no;
        int temp = no;
        int count = 0;
        int sum = 0;

        // Count number of digits
        while(temp != 0)
        {
            count++;
            temp = temp / 10;
        }

        // Calculate Disarium sum
        while(no != 0)
        {
            int digit = no % 10;

            sum = sum + (int)Math.pow(digit, count);

            count--;
            no = no / 10;
        }

        if(sum == original)
        {
            System.out.println("Disarium Number");
        }
        else
        {
            System.out.println("Not Disarium Number");
        }

        sobj.close();
    }
}