public class MyHr {
    public static void main(String[] args) {
        
        office office1 = new office();
        office office2 = new office();
        office office3 = new office();

        
        employee employee1 = new employee("John Doe", new address("13 Main St", "Carlow", "Carlow"));
        employee employee2 = new employee("Jane Smith", new address("6 Elm St", "carlow", "Carlow"));
        employee2.makeManager("Honda");
        
        office1.addEmployee(employee1);
        office2.addEmployee(employee2);

        
        System.out.println(office1);
        System.out.println("Employees in Office 1:");
        for (int i = 0; i < office1.getEmployees().length; i++) {
            employee employee = office1.getEmployees()[i];
            if (employee != null) {
                System.out.println(employee);
            }
        }

        System.out.println();

        System.out.println(office2);
        System.out.println("Employees in Office 2:");
        for (int i = 0; i < office2.getEmployees().length; i++) {
            employee employee = office2.getEmployees()[i];
            if (employee != null) {
                System.out.println(employee);
            }
        }

       
    }
}
