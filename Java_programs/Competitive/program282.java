import java.util.Scanner;

class program282
{
    public static void main(String A [])
    {
         Scanner sc = new Scanner(System.in);

        // Take rows and columns
        int R = sc.nextInt();
        int C = sc.nextInt();

        // Create 2D array
        int[][] matrix = new int[R][C];

        // Take matrix input
        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 1. Count total booked seats
        int totalBooked = 0;

        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                if(matrix[i][j] == 1)
                {
                    totalBooked++;
                }
            }
        }

        // 2. Find row with maximum bookings
        int maxBookings = 0;
        int maxRow = 0;

        for(int i = 0; i < R; i++)
        {
            int rowCount = 0;

            for(int j = 0; j < C; j++)
            {
                if(matrix[i][j] == 1)
                {
                    rowCount++;
                }
            }

            if(rowCount > maxBookings)
            {
                maxBookings = rowCount;
                maxRow = i + 1;
            }
        }

        // 3. Check if any row is completely full
        boolean fullRow = false;

        for(int i = 0; i < R; i++)
        {
            boolean isFull = true;

            for(int j = 0; j < C; j++)
            {
                if(matrix[i][j] == 0)
                {
                    isFull = false;
                    break;
                }
            }

            if(isFull)
            {
                fullRow = true;
                break;
            }
        }

        // 4. Display output
        System.out.println("Total Booked Seats: " + totalBooked);
        System.out.println("Row With Maximum Bookings: Row " + maxRow);

        if(fullRow)
        {
            System.out.println("Full Row Exists: Yes");
        }
        else
        {
            System.out.println("Full Row Exists: No");
        }
    }
}