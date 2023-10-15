class employee {
    private static int employeeNumberCounter = 1000;
    private int employeeNumber;
    private String name;
    private address address;
    private String employeeType; 
    private String companyCarDetails;

    public employee(String name, address address) 
        {
            this.employeeNumber = employeeNumberCounter++;
            this.name = name;
            this.address = address;
            this.employeeType = "staff";
            
        }

    public int getEmployeeNumber() 
        {
            return employeeNumber;
        }

    public String getName() 
        {
            return name;
        }

    public void setName(String name) 
        {
            this.name = name;
        }

    public address getAddress() 
        {
            return address;
        }

    public void setAddress(address address) 
        {
            this.address = address;
        }

    public String getEmployeeType() 
        {
            return employeeType;
        }

    public void makeManager(String companyCarDetails) 
        {
            this.employeeType = "manager";
            this.companyCarDetails = companyCarDetails;
        }

    public String getCompanyCarDetails() 
        {
            return companyCarDetails;
        }

    public void setCompanyCarDetails(String companyCarDetails) 
        {
            this.companyCarDetails = companyCarDetails;
        }

    
    public String toString() {
        if(employeeType == "manager")
        {
             return "Employee Number: " + employeeNumber + "\n" +
               "Name: " + name + "\n" +
               "Address: " + address.toString() + "\n" +
               "Employee Type: " + employeeType + "\n" +
               "Company Car Details: " + companyCarDetails;
        }
       else
       {
            return "Employee Number: " + employeeNumber + "\n" +
               "Name: " + name + "\n" +
               "Address: " + address.toString() + "\n" +
               "Employee Type: " + employeeType;
       }
    }
}