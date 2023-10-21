public class Circle extends Point{

    private int radius;

    public Circle(int x, int y, int radius)
        {
            super(x, y);
            setRadius(radius);
        }

    public int getRadius() 
        {
            return this.radius;
        }

    public void setRadius(int radius) 
        {
            this.radius = radius;
        }
    public String toString() 
        {
            return super.toString() + ", " + radius;
        }
    
}
