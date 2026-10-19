import java.util.Scanner;

class program289
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Squar = 0, devisor = 1, temp = 0;

        System.out.println("Enter number :");
        int no = sobj.nextInt();

        Squar = no * no;

        temp = no;

        while(temp != 0)
        {
            devisor = devisor * 10;

            temp = temp / 10;
        }

        if(Squar % devisor == no)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not Automorphic Number");
        }
        
    }
}