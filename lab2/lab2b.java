public class lab2b 
{
    public static void main(String[] args)
    {
        rectangle rectangleA = new rectangle();
        rectangleA.rToString();

        rectangleA.setLenght(9);
        rectangleA.setWidth(15);

        System.out.println("The new Lenght is " + rectangleA.getLength() + ", the new width is " + rectangleA.getWidth() );
        System.out.println("The area is " + rectangleA.getArea() + ", the perimeter is " + rectangleA.getPerimeter());
        rectangleA.printRectangle();
    }
}
