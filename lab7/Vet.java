public class Vet {
    private String name;

    // Constructor
    public Vet(String name) {
        this.name = name;
    }

    // Method to vaccinate an animal
    public void vaccinate(Animal animal) {
        System.out.println(name + " is vaccinating.");
        System.out.println(animal.getType() + " has been vaccinated");

    }
}
