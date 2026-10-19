import java.util.Scanner;

class Matrix
{
    int AddDiagnonal(int Arr[][], int iRow, int iCol)
    {
        int Sum = 0;

        for(int i = 0; i < iRow && i < iCol; i++)
        {
            Sum = Sum + Arr[i][i];
        }

        return Sum;
    }

    int FrequencyOfNum(int Arr[][], int iRow, int iCol, int iNo)
    {
        int frequency = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    frequency++;
                }
            }
        }

        return frequency;
    }
}

class program295
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        int iNo = 0;

        System.out.println("Enter rows :");
        int iRow = sobj.nextInt();

        System.out.println("Enter colums :");
        int iCol = sobj.nextInt();

        System.out.println("Enter Number for check frequwncy :");
        iNo = sobj.nextInt();

        int arr[][] = {
                            {3, 2, 5, 9},
                            {4, 3, 2, 2},
                            {8, 4, 1, 9},
                            {3, 9, 7, 5}
                        };

        System.out.println("Matrix is :");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.println();
        }

        Matrix matrix = new Matrix();

       iRet =  matrix.AddDiagnonal(arr, iRow, iCol);
       System.out.println("Addition of diagonal is : "+iRet);

       iRet = matrix.FrequencyOfNum(arr, iRow, iCol, iNo);
       System.out.println("Frequancy of that number is : "+iRet);

    }
}