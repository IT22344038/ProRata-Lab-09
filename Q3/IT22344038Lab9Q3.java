public class IT22344038Lab9Q3 {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int square(int x) {
        return multiply(x, x);
    }

    public static void main(String[] args) {
        // (3 * 4 + 5 * 7)^2 = (12 + 35)^2 = 47^2
        int expr1 = square(add(multiply(3, 4), multiply(5, 7)));

        // (4 + 7)^2 + (8 + 3)^2 = 11^2 + 11^2
        int expr2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)^2     : " + expr1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + expr2);
    }
}