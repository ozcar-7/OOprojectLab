public class rectangle 
{
    public int lenght;
    public int width;

    public  rectangle()
        {
            lenght = 1;
            width =1;
        }
    
    public void setLenght(int len)
        {
            if((len > 0) && (len <= 40) )
                {
                    lenght = len;
                }
            else
                {
                    System.out.println("Enter a number between 1 and 40");
                }
        }
    
    public void setWidth(int wid)
        {
            if((wid > 0) && (wid <= 40) )
                {
                    width = wid;
                }
            else
                {
                    System.out.println("Enter a number between 1 and 40");
                }
        }

    public int getLength()
        {
            return lenght;
        }

    public int getWidth()
        {
            return width;
        }

    public int getArea()
        {
            int area;
            area = lenght * width;
            return area;
        }
    
    public int getPerimeter()
        {
            int perimeter;
            perimeter = (lenght * 2) + (width * 2);
            return perimeter;
        }
    
    
    public void rToString()
        {
           
            System.out.println("Lenght = " + lenght + ", Width = " + width );
            
        }
    
    public void printRectangle()
        {
            for (int index = getWidth(); index > 0 ; index--)
                {
                    System.out.print("*");
                }
            System.out.println();
            
            for (int index = getLength() -2; index > 0 ; index--)
                {
                    for (int index1 = getWidth() ; index1 > 0 ; index1--)
                        {
                            if (index1 == getWidth() ) 
                                {
                                    System.out.print("*");
                                }
                            else if (index1 > 1)
                                {
                                    System.out.print(" ");
                                }

                            else if (index1 == 1)
                                {
                                    System.out.println("*");
                                }
                            
                        }
                }

            for (int index = getWidth(); index > 0 ; index--)
                {
                    System.out.print("*");
                }
            
        }
    
    


}