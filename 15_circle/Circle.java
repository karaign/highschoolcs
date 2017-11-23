import java.util.*;

/**
 * Represents a circle.
 * 
 * @author  Kara I
 * @version 1.0
 */
public class Circle
{
    public double radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(double r)
    {
        radius = r;
    }

    /**
     * returns the circumference
     */
    public double circumference()
    {
        return 2 * Math.PI * radius;
    }
    
    /**
     * returns the area
     */
    public double area()
    {
        return radius * radius * Math.PI;
    }
    
    /**
     * returns the diameter
     */
    public double diameter()
    {
        return 2 * radius;
    }


}
