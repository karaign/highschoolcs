public class Tester
{
    public static void main (String[] args)
    {
        final int COL = 15; // column size
        // print the header
        System.out.println(
            pad("Decimal", COL) +
            pad("Binary", COL) +
            pad("Octal", COL) +
            pad("Hex", COL) +
            pad("Character", COL)
        );
        
        // go through the numbers
        for (int i = 65; i <= 90; i++) {
            System.out.println(
                pad(Integer.toString(i), COL) +
                pad(Integer.toBinaryString(i), COL) +
                pad(Integer.toOctalString(i), COL) +
                pad(Integer.toHexString(i), COL) +
                pad(Character.toString( (char) i ), COL)
            );
        }
    }
    
    // util function to pad a string
    private static String pad (String str, int n)
    {
        return String.format("%1$-" + n + "s", str);  
    }
}
