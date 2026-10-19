import java.util.Scanner;

class program273
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int mins = 0;
        int gb = 0;
        int sms = 0;

        System.out.println("Enter call minutes :");
        mins = sobj.nextInt();

        System.out.println("Enter data usage in GB :");
        gb = sobj.nextInt();

        System.out.println("Enter SMS count :");
        sms = sobj.nextInt();

        if(mins < 0 || gb < 0 || sms < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        // Plan 1
        int plan1 = 199;

        if(mins > 300)
            plan1 = plan1 + (mins - 300) * 1;

        if(gb > 5)
            plan1 = plan1 + (gb - 5) * 20;

        if(sms > 100)
            plan1 = plan1 + (sms - 100) * 1;


        // Plan 2
        int plan2 = 299;

        if(mins > 500)
            plan2 = plan2 + (mins - 500) * 1;

        if(gb > 10)
            plan2 = plan2 + (gb - 10) * 15;

        if(sms > 200)
            plan2 = plan2 + (sms - 200) * 1;


        // Plan 3
        int plan3 = 399;

        if(mins > 700)
            plan3 = plan3 + (mins - 700) * 1;

        if(gb > 15)
            plan3 = plan3 + (gb - 15) * 10;

        if(sms > 300)
            plan3 = plan3 + (sms - 300) * 1;


        // Plan 4
        int plan4 = 499;

        if(mins > 1000)
            plan4 = plan4 + (mins - 1000) * 1;

        if(gb > 20)
            plan4 = plan4 + (gb - 20) * 10;

        if(sms > 500)
            plan4 = plan4 + (sms - 500) * 1;


        // Find cheapest plan
        int min = plan1;
        String recommendedPlan = "Plan 1";

        if(plan2 < min)
        {
            min = plan2;
            recommendedPlan = "Plan 2";
        }

        if(plan3 < min)
        {
            min = plan3;
            recommendedPlan = "Plan 3";
        }

        if(plan4 < min)
        {
            min = plan4;
            recommendedPlan = "Plan 4";
        }


        System.out.println("Plan 1 Cost : ₹" + plan1);
        System.out.println("Plan 2 Cost : ₹" + plan2);
        System.out.println("Plan 3 Cost : ₹" + plan3);
        System.out.println("Plan 4 Cost : ₹" + plan4);

        System.out.println("----------------------");
        System.out.println("Recommended Plan : " + recommendedPlan);
        System.out.println("Total Cost       : ₹" + min);
    }
}