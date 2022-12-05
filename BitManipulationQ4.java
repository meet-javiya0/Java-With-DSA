public class BitManipulationQ4 {
    public static void main(String args[]) {
        // better way to convert uppercase to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' ') + " ");
        }
        System.out.println();
    }
}