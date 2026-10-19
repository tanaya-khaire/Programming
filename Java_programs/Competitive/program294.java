import java.util.Scanner;

class program294
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Sum = 0;

        System.out.println("Enter rows :");
        int iRow = sobj.nextInt();

        System.out.println("Enter colums :");
        int iCol = sobj.nextInt();

        int arr[][] = new int[iRow][iCol];

        System.out.println("Enter the matrix elemets :");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                arr[i][j] = sobj.nextInt();
            }

            System.out.println();
        }

        System.out.println("Matrix is :");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.println();
        }

        for(int i = 0; i < iRow && i < iCol; i++)
        {
            Sum = Sum + arr[i][i]
        }

        System.out.println("Sum od diagonal elemets :" + Sum);
    }
}