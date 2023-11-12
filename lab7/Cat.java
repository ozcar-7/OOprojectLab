public class Cat extends Animal 
{
    public Cat(String type, int age, char gender) {
        super(type, age, gender);
    }    
    @Override
    public void makeSound() {
        System.out.println("Prrrrrr");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }

    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

