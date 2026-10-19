import java.util.Scanner;

class program278
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Steps[] = new int[7];
        int Max = 0;
        int iCount = 0;

        System.out.println("Enter steps for 7 days : ");

        for(int i = 0; i < Steps.length; i++)
        {
            Steps[i] = sobj.nextInt();

            if(Steps[i] < 0)
            {
                System.out.println("Invalid input ");
                return;
            }

            if(Steps[i] >= 5000)
            {
                iCount++;
            }

            if(Max < Steps[i])
            {
                Max = Steps[i];
            }
        }

        System.out.println("Goal Achieved Days : "+iCount);
        System.out.println("Maximum Steps in Week : "+Max);

    }
}