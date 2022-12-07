public class TilingProblem {
    public static int ways(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // ways(n - 1) is vertical choices
        // ways(n - 2) is horizontal choices
        return ways(n - 1) + ways(n - 2);
    }

    public static void main(String args[]) {
        System.out.println(ways(4));
    }
}

// Question : Given a "2 x n" floor and tiles of size "2 x 1", count the number
// of ways to tile the given floor using the 2 x 1 tiles. (A tile can either be
// placed horizontally or vertically.)