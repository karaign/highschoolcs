public class Tester
{
    public static void main(String gg[])
    {
    int p = 386, q = 581, n = 0;
    System.out.println("Hello"); //Start timing first loop when “Hello” is printed
    for(int j=0; j<2000000000; j++)
    {
        //for(int k = 0; k < 1000; k++) //Use this extra loop for faster computers
        n = ((p * 2) + q) / 2;
    }
    System.out.println(n); //When this line prints, stop timing the first loop and
    //begin timing the second loop.
    for(int j=0; j<2000000000; j++)
    {
        n = p + (q >> 1);
    }
    System.out.println(n);
    }
}