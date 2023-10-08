package lab3;

public class BankCustumer 
{
    private String name;
    private String address;
    private int noOfAccount = 0;
    private SavingAccount[] account;
    

    public BankCustumer(String newName, String newAddress)
        {
            name = newName;
            address = newAddress;
            account = new SavingAccount[3];
            
        }
    
    public void modifyName(String newName)
        {
            name = newName;
        }

    public void modifyAddress(String newAddress)
        {
            name = newAddress;
        }
        
        
    
    public void addAccount(SavingAccount newAccount)
        {
            if (noOfAccount < 3)
                {
                    noOfAccount++;
                    account[noOfAccount-1] = newAccount;
                }
            else
                {
                    System.out.println("Maximum number of accounts reached");
                }
                 
        }

    public String getName()
        {
            return name;
        }

    public String getAddress()
        {
            return address;
        }
    
    public double balance()
        {
            double totalBalance = 0;

            for(int i = 0; i < noOfAccount; i++)
                {
                    totalBalance += account[i].getSavingBalance();
                }
            return totalBalance;

        }
    
    public void  summary()
        {
            for(int i = 0; i < noOfAccount; i++)
                {
                    System.out.println(name + " Account " + (i + 1) + " has a balance of " + account[i].getSavingBalance());
                }
        }
}
