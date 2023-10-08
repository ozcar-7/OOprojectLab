package lab3;

public class lab3q2 
{
    public static void main(String args[])
    {
        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);

        SavingAccount.modifyIntrestRate(0.04);

        saver1.calculateMontlyIntrest();
        saver2.calculateMontlyIntrest();

        System.out.println(saver1.toString());
        System.out.println(saver2.toString());

        SavingAccount.modifyIntrestRate(0.05);

        saver1.calculateMontlyIntrest();
        saver2.calculateMontlyIntrest();

        System.out.println("After one month");
        System.out.println(saver1.toString());
        System.out.println(saver2.toString());


    }
}
