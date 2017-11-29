import java.util.*;
/**
 * Models a circle on the ground and a square circumscribed around it,
 * where raindrops can randomly fall.
 *
 * @author Kara I
 * @version 29/11/2017
 */
public class MonteCarlo
{
    /**
     * The x coordinate of the circle's centre
     */
    public double h;
    
    /**
     * The y coordinate of the circle's centre
     */
    public double k;
    
    /**
     * The circle's radius
     */
    public double r;
    
    /**
     * A Random instance to generate random numbers
     */
    private Random rndm;

    /**
     * Constructor for objects of class MonteCarlo
     */
    public MonteCarlo(double centreX, double centreY, double radius)
    {
        // initialise instance variables
        rndm = new Random();
        h = centreX;
        k = centreY;
        r = radius;
    }

    /**
     * Returns a random X coordinate of a possible raindrop within the square
     */
    public double nextRainDrop_x()
    {
        // Pick a random x coordinate between h - r and h + r
        return (h - r) + 2 * r * rndm.nextDouble();
    }
    
    /**
     * Returns a random Y coordinate of a possible raindrop within the square
     */
    public double nextRainDrop_y()
    {
        // Pick a random y coordinate between k - r and k + r
        return (k - r) + 2 * r * rndm.nextDouble();
    }
    
    /**
     * Checks whether a given point is inside or on the circle
     */
    public boolean insideCircle(double x, double y)
    {
        return Math.pow(x - h, 2) + Math.pow(y - k, 2) <= Math.pow(r, 2);
    }

}
