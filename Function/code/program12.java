class MidpointCheck 
{

    public static boolean hasMidpoint(int a, int b, int c) 
    {
        // Check if a is the midpoint
        if ((b <= a && a <= c) || (c <= a && a <= b)) {
            return true;
        }

        // Check if b is the midpoint
        if ((a <= b && b <= c) || (c <= b && b <= a)) {
            return true;
        }

        // Check if c is the midpoint
        if ((a <= c && c <= b) || (b <= c && c <= a)) {
            return true;
        }

        return false; // No midpoint relationship exists
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println(hasMidpoint(a, b, c)); // Output: true
}
}
