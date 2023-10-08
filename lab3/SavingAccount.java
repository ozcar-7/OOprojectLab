package lab3;

public class SavingAccount 
{
    private int accountId;
    private static double annualIntrestRate;
    private double savingBalance;
    private static int count = 0;

    public SavingAccount()
        {
            count++;
            accountId = count;
            savingBalance = 0;

        }

    public SavingAccount(double newSaving) //constructor for if you want to set saving balance
        {
            count++;
            accountId = count;
            savingBalance = newSaving;

        }

    public void setSavingBalance(double newSaving)
        {
            savingBalance = newSaving;
        }
    
    public static void modifyIntrestRate(double newIntrest)
        {
            annualIntrestRate = newIntrest;
        }

    public double getSavingBalanve()
        {
            return savingBalance;
        }


    public void calculateMontlyIntrest()
        {                  
            double monthIntrest = savingBalance * (annualIntrestRate / 12);  
            savingBalance += monthIntrest;
        }

    public String toString()
        {
            return  "custumer "+ accountId + " balance is "+ savingBalance;
        }

    
    

    





}
