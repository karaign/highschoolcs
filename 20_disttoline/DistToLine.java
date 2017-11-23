import static java.lang.Math.*;
/**
 * Computes the distance from a point to a line w/o creating an object
 * 
 * @author Kara I
 * @version 24/10/2017
 */
public class DistToLine
{
    // a line is represented as an equation of the form Ax + By + C = 0
    public static double A, B, C;

    /**
     * Calculates the distance betwen the line Ax + By + C = 0 and the point (a, b)
     * @return    the distance
     */
    public static double getDist(double a, double b)
    {
        return abs(A * a + B * b + C) / sqrt(pow(A, 2) + pow(B, 2));
    }
}
