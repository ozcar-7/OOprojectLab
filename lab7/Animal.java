public class Animal {
    private String type;
    private int age;
    private char gender;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // Constructor
    public Animal(String type, int age, char gender) {
        this.type = type;
        this.age = age;
        this.gender = gender;
    }

    // Method to print "Animal is eating"
    public void eat() {
        System.out.println(type + " is eating");
    }

    // Method to print "Animal is sleeping"
    public void sleep() {
        System.out.println(type + " is sleeping");
    }

    // Method to print "A generic animal sound"
    public void makeSound() {
        System.out.println("A generic animal sound");
    }

    // Method to print the type, age, and gender of the animal
    @Override
    public String toString() {
        return "Type: " + type + ", Age: " + age + ", Gender: " + gender;
    }
}
