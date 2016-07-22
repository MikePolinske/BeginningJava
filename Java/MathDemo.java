public class MathDemo {
    public static void main(String[] args) {
        int alpha = 3;
        int bravo = 13;
        
        System.out.println(alpha + bravo);
        System.out.println(alpha - bravo);
        System.out.println(bravo * alpha);
        System.out.println(bravo / alpha);  // Note: 13/3 is not really a whole number
        System.out.println(bravo % alpha);
        
        System.out.println((double)bravo/(double)alpha);
        /* Because we've casted the numbers as doubles, the real value is displayed. */
    }
}