import java.util.Scanner;

class program275
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int rows;
        int cols;

        System.out.println("Enter number of rows :");
        rows = sobj.nextInt();

        System.out.println("Enter number of columns :");
        cols = sobj.nextInt();

        boolean seats[][] = new boolean[rows][cols];

        int rowPrice[] = {200,300,400};

        System.out.println("Enter number of already booked seats :");
        int booked = sobj.nextInt();

        // Mark already booked seats
        for(int i = 0; i < booked; i++)
        {
            System.out.println("Enter booked seat Row and Column :");

            int r = sobj.nextInt();
            int c = sobj.nextInt();

            seats[r-1][c-1] = true;
        }

        System.out.println("Enter number of requested seats :");
        int request = sobj.nextInt();

        int reqRow[] = new int[request];
        int reqCol[] = new int[request];

        // Input requested seats
        for(int i = 0; i < request; i++)
        {
            System.out.println("Enter requested seat Row and Column :");

            reqRow[i] = sobj.nextInt();
            reqCol[i] = sobj.nextInt();
        }

        // Check availability
        for(int i = 0; i < request; i++)
        {
            if(seats[reqRow[i]-1][reqCol[i]-1] == true)
            {
                System.out.println("Booking Failed");
                System.out.println("Seat already booked : Row "
                        + reqRow[i] + " Column " + reqCol[i]);
                return;
            }
        }

        int totalCost = 0;

        // Calculate cost and book seats
        for(int i = 0; i < request; i++)
        {
            totalCost = totalCost + rowPrice[reqRow[i]-1];

            seats[reqRow[i]-1][reqCol[i]-1] = true;
        }

        // Group discount
        if(request >= 6)
        {
            int discount = totalCost * 10 / 100;

            totalCost = totalCost - discount;
        }

        int remaining = 0;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(seats[i][j] == false)
                {
                    remaining++;
                }
            }
        }

        System.out.println("Booking Successful");
        System.out.println("Total Cost : ₹" + totalCost);
        System.out.println("Remaining Seats : " + remaining);
    }
}