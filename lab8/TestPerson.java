public class TestPerson {
    public static void main(String[] args) {
        // Create an array of type Person
        Person[] people = new Person[2];

        // Create instances of Employee and Student
        people[0] = new Employee("John Doe", 50000.0);
        people[1] = new Student("Alice Smith", "Computer Science");

        // Print information using polymorphism
        for (int i = 0; i < people.length; i++ ) {
            System.out.println("Name: " + people[i].getName());
            System.out.println("Description: " + people[i].getDescription());
            System.out.println();
        }
    }
}