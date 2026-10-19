import java.util.Scanner;

class program271
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Days = 0;
        int MedicineBill = 0;
        int ConsutFee = 0;
        int TotalBill = 0;
        int InsuranceCover = 0;
        int FinalPay = 0;

        String Insured = null;
        String WardType = null;

        System.out.println("Enter how many days patient is in hospital :");
        Days = sobj.nextInt();

        System.out.println("Enter patient ward type (Normal / ICU) :");
        WardType = sobj.next();

        System.out.println("Enter Medicine Bill :");
        MedicineBill = sobj.nextInt();

        System.out.println("Enter Consultation Fee :");
        ConsutFee = sobj.nextInt();

        System.out.println("Does patient have insurance (Yes / No) :");
        Insured = sobj.next();

        if(Days < 0 || MedicineBill < 0 || ConsutFee < 0)
        {
            System.out.println("Enter valid inputs");
            return;
        }

        if(WardType.equalsIgnoreCase("ICU"))
        {
            TotalBill = MedicineBill + ConsutFee + (Days * 5000);
        }
        else
        {
            TotalBill = MedicineBill + ConsutFee + (Days * 2000);
        }

        if(Insured.equalsIgnoreCase("YES"))
        {
            InsuranceCover = Math.min(TotalBill * 70 / 100, 50000);
        }

        FinalPay = TotalBill - InsuranceCover;

        System.out.println("Total Bill : " + TotalBill);
        System.out.println("Insurance Cover : " + InsuranceCover);
        System.out.println("Final Pay : " + FinalPay);
    }
}