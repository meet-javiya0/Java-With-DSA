public class FriendsPairingProblemByRecursion {
    public static int friendspar(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendspar(n - 1) + (n - 1) * friendspar(n - 2);
    }

    public static void main(String args[]) {
        System.out.println(friendspar(4));
    }
}

// Question : Given n friends, each one can remain single or can be paired up
// with some friend. Each friend can be paired only once. Find out the total
// number of ways in which friends can remain single or can be paired up.