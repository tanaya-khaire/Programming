import java.util.*;

class program266
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks = 0;
        int Attendances = 0;
        int Income = 0;

        System.out.println("Enter the Marks :");
        Marks = sobj.nextInt();

        System.out.println("Enter the Attendance :");
        Attendances = sobj.nextInt();

        System.out.println("Enter the anual income :");
        Income = sobj.nextInt();

        if((Marks < 0 || Attendances < 0 || Income < 0))
        {
            System.out.println("Invalid Inputs");
            return;
        }

        if(Marks < 80 )
        {
            System.out.println("Scholarship Rejected : Marks is lower");
        }
        else if(Attendances < 75)
        {
            System.out.println("Scholarship Rejected : Attendances is lower");
        }
        else if(Income > 300000)
        {
            System.out.println("Scholarship Rejected : Income is too high");
        }
        else 
        {
            System.out.println("Scholarship Approved");
        }

    }
}