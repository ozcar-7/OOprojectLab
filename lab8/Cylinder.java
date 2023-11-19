public class Cylinder extends ThreeDShape {
    private double radius;
    private double height;

    public Cylinder(String name, String colour, double radius, double height) {
        super(name, colour);
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public String toString()
        {
            return super.toString() + "\nRadius = " + radius + "\nHeight = " + height ;
        }
}