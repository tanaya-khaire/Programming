import java.util.*;

class program258
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = new int[5];
        int i = 0;
        int Avg = 0;

        System.out.println("Enter student marks");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();

            if(Arr[i] < 0 || Arr[i] > 100)
            {
                System.out.println("Invalid marks");
                return;
            }
        }

        for(i  = 0; i < Arr.length; i++)
        {
            if(Arr[i] < 35)
            {
                System.out.println("Student is fail");
                return;
            }

            Avg = Arr[i] + Avg;
        }

        Avg = Avg / Arr.length;
        System.out.println("Average Marks : "+Avg);

       if(Avg >= 75)
        {
            System.out.println("Final Result: Distinction");
        }
        else if(Avg >= 60)
        {
            System.out.println("Final Result: First Class");
        }
        else if(Avg >= 50)
        {
            System.out.println("Final Result: Second Class");
        }
        else
        {
            System.out.println("Final Result: Pass");
        }
        
    }
}