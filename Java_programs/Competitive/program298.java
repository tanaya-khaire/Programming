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

    int MaxDiagonal(int Arr[][], int iRow, int iCol)
    {
        int MaxDia = 0;

        for(int i = 0; i < iRow && i < iCol; i++)
        {
            // Main diagonal
            if(MaxDia < Arr[i][i])
            {
                MaxDia = Arr[i][i];
            }

            // Secondary diagonal
            int j = iCol - 1 - i;

            if(j >= 0 && j < iCol && MaxDia < Arr[i][j])
            {
                MaxDia = Arr[i][j];
            }
        }

        return MaxDia;
    }

    void AddColumn(int Arr[][], int iRow, int iCol)
    {
        int sum = 0;

        for(int i = 0; i < iCol; i++)
        {
            sum = 0;

            for(int j = 0; j < iRow; j++)
            {
                sum = sum + Arr[j][i];
            }

            System.out.println("Sum of column " + (i + 1) + " : " + sum);
        }
    }

    void SwapRows(int Arr[][], int iRow, int iCol)
    {
        for(int i = 0; i < iRow - 1; i = i + 2)
        {
            for(int j = 0; j < iCol; j++)
            {
                int temp = Arr[i][j];
                Arr[i][j] = Arr[i + 1][j];
                Arr[i + 1][j] = temp;
            }
        }
    }
}

class program298
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

        System.out.println("Enter Number for check frequwncy :");
        iNo = sobj.nextInt();

        Matrix matrix = new Matrix();

        iRet =  matrix.AddDiagnonal(arr, iRow, iCol);
        System.out.println("Addition of diagonal is : "+iRet);

        iRet = matrix.FrequencyOfNum(arr, iRow, iCol, iNo);
        System.out.println("Frequancy of that number is : "+iRet);

        iRet = matrix.MaxDiagonal(arr, iRow, iCol);
        System.out.println("MaxDiagonal is : "+iRet);

        matrix.AddCloumn(arr, iRow, iCol);

    }
}