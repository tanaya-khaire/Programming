import java.util.Scanner;

class program277
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int N = 0;
        int Duplicate = 0;
        int iCnt = 0;

        System.out.println("Enter number of votes :");
        N = sobj.nextInt();

        if(N < 0)
        {
            System.out.println("Invalid voter Number");
            return;
        }

        System.out.println("Enter number of voter IDs");

        int votes[] = new int[N];

        for(int i = 0; i < N; i++)
        {
            votes[i] = sobj.nextInt();

            if(votes[i] < 0)
            {
                System.out.println("Invalid inputs");
                return;
            }
        }

        for(int i = 0; i < votes.length; i++)
        {
            boolean bFlag = false;

            for(int j = 0; j < N; j++)
            {
                if(votes[i] == votes[j])
                {
                    bFlag = true;
                }

                break;
            }

            if(bFlag == true)
            {
                Duplicate++;
            }
            else
            {
                iCnt++;
            }
        }

        System.out.println("Valid Votes : " + iCnt);
        System.out.println("Rejected Duplicate Votes : " + Duplicate);

    }
}