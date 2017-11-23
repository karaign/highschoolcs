import java.util.*;
/**
 * A class for "encrypting" strings
 */
public class Crypto
    {
    public String encrypt(String s) 
    {
        String result = "";
        // scan the string character by character
        // copy characters to result, replacing some of them
        for (int i = 0, len = s.length(); i < len; i++)
        {
            String next = Character.toString(s.charAt(i));
            String lower = next.toLowerCase();
            result += 
                lower.equals("v") ? "ag',r" :
                lower.equals("m") ? "ssad"  :
                lower.equals("g") ? "jeb..w":
                lower.equals("b") ? "dug>?/":
                next;
        }
        
        return result;
    }
    
    public String decrypt(String s)
    {   
        return s
            .replaceAll("ag',r", "v")
            .replaceAll("ssad", "m")
            .replaceAll("jeb\\.\\.w", "g")
            .replaceAll("dug\\>\\?\\/", "b");

    }

}
