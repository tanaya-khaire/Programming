import java.util.Scanner;

class program291
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int no = sobj.nextInt();

        int number = no + 1;

        int root = (int)Math.sqrt(number); // return square root

        if(root * root == number)
        {
            System.out.println("Sunny Number");
        }
        else
        {
            System.out.println("Not Sunny Number");
        }

        sobj.close();
    }
}