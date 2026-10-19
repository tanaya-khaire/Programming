import java.util.Scanner;

class program279
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Duration = 0;
        int amount = 0;

        System.out.println("Enter call duration (minutes) :");
        Duration = sobj.nextInt();

        if(Duration < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Duration <= 5)
        {
            amount = 0;
        }
        else if(Duration <= 15)
        {
            amount = Duration - 5;
        }
        else
        {
            amount = 10 + ((Duration - 15) * 2);
        }

        System.out.println("Call Duration : " + Duration + " Minutes");
        System.out.println("Total Call Charge : ₹" + amount);
    }
}