class office {
    private static int officeNumberCounter = 100;
    private int officeNumber;
    private static final int MAX_EMPLOYEES = 2;
    private employee[] employees;
    private int employeeCount; 

    public office() {
        this.officeNumber = officeNumberCounter++;
        this.employees = new employee[MAX_EMPLOYEES];
        this.employeeCount = 0;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    
    public boolean addEmployee(employee employee) {
        if (employeeCount < MAX_EMPLOYEES) {
            employees[employeeCount++] = employee;
            return true;
        }
        return false;
    }

   
    public employee[] getEmployees() {
        return employees;
    }

   
    public String toString() {
        return "Office " + officeNumber + " - Max Employees: " + MAX_EMPLOYEES;
    }
}
