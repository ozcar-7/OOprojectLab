package lab3;

public class lab3q3 
{
    public static void main(String args[])
    {
        BankCustumer custumer1 = new BankCustumer("liam", "dublin");
        BankCustumer custumer2 = new BankCustumer("tobi", "limrick");

        SavingAccount custumer1save1 = new SavingAccount(2000);
        SavingAccount custumer1save2 = new SavingAccount(3000);
        SavingAccount custumer1save3 = new SavingAccount(7000);


        custumer1.addAccount(custumer1save1);
        custumer1.addAccount(custumer1save2);
        custumer1.addAccount(custumer1save3);

        SavingAccount custumer2save1 = new SavingAccount(8000);
        SavingAccount custumer2save2 = new SavingAccount(10000); 
        
        custumer2.addAccount(custumer2save1);
        custumer2.addAccount(custumer2save2);

        System.out.println(custumer1.getName() + " total balance is " + custumer1.balance());
        System.out.println(custumer2.getName() + " total balance is " + custumer2.balance());

        custumer1.summary();
        custumer2.summary();

        
    }
}
