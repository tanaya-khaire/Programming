import java.util.*;

class program270
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Percentage = 0;
        String Battery;

        System.out.println("Enter battery percentage :");
        Percentage = sobj.nextInt();

        if(Percentage < 0)
        {
            System.out.println("Invalid Input ");
            return;
        }

        if(Percentage <= 5)
        {
            Battery = "Critical";
        }
        else if(Percentage <= 15)
        {
            Battery = "Low";
        }
        else 
        {
            Battery = "Normal";
        }

        System.out.println("Battery Percentage : "+Percentage);
        System.out.println("Status : "+Battery);
    } 
}