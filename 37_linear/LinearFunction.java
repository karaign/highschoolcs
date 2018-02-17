
/**
 * Represents a linear function
 */
public class LinearFunction implements LinearFunctionMethods {
    private double slope, yIntercept;
    
    public LinearFunction (double slope, double yIntc) {
        this.slope = slope;
        this.yIntercept = yIntc;
    }
    
    public double getSlope () {
        return slope;
    }
    
    public double getYintercept () {
        return yIntercept;
    }
    
    public double getYvalue (double x) {
        // y = mx + c
        return slope * x + yIntercept;
    }
    
    public double getXvalue (double y) {
        // x = (y - c)/m
        return (y - yIntercept) / slope;
    }
    
    public double getRoot () {
        // y = 0
        return getXvalue(0);
    }
}
