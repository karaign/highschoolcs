public class Automobile
{
    private double mpg;
    private double gallons = 0;
    
    public Automobile (double mileage) {
        mpg = mileage;
    }
    
    public void fillUp (double amount) {
        gallons += amount;
    }
    
    public void takeTrip (double miles) {
        gallons -= miles / mpg;
    }
    
    public double reportFuel () {
        return gallons;
    }
}
