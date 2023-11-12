public class Dog extends Animal {
    public Dog(String type, int age, char gender) {
        super(type, age, gender);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

