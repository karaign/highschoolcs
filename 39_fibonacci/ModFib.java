public class ModFib
{
    public static int modFibonacci (int k) {
        switch (k) {
            case 0: return 3;
            case 1: return 5;
            case 2: return 8;
            default: return modFibonacci(k - 1) + modFibonacci(k - 2) + modFibonacci(k - 3);
        }
    }
}
