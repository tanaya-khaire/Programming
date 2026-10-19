
import java.util.Scanner;

class program281
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int student = 0;
        int subject = 0;
        int total = 0;
        int topper = 0;
        int iMax = 0;
        int index = 0;
        int avg = 0;

        System.out.println("Enter number of student : ");
        student = sobj.nextInt();

        System.out.println("Enter number of subject : ");
        subject = sobj.nextInt();

        int arr[][] = new int[student][subject];

        for(int i = 0; i < student; i++)
        {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
                
            for(int j = 0; j < subject; j++)
            {
                arr[i][j] = sobj.nextInt();

                if(arr[i][j] < 0 || arr[i][j] > 100)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }

            System.out.println("");
        }

        System.out.println("Student Totals :");

        for(int i = 0; i < student; i++)
        {
            total = 0;

            for(int j = 0; j < subject; j++)
            {
                total = total + arr[i][j];
            }

            System.out.println("Student "+(i + 1)+":"+total);

            if(iMax < total)
            {
                iMax = total;
                index = (i + 1);
            }
        }

        System.out.println("Topper : Student "+index);

        System.out.println("Subject Averages : ");

        for(int i = 0; i < subject; i++)
        {
            int sum = 0;

            for(int j = 0; j < student; j++)
            {
                sum = sum + arr[j][i];
            }

            double average = (double)sum / student;

            System.out.printf("Subject %d: %.2f%n", (i + 1), average);
        }

        System.out.println("\nStudents Failed:");

        for(int i = 0; i < student; i++)
        {
            boolean failed = false;

            for(int j = 0; j < subject; j++)
            {
                if(arr[i][j] < 35)
                {
                    failed = true;
                    break;
                }
            }

            if(failed)
            {
                System.out.println("Student " + (i + 1));
            }
        }
    }
}