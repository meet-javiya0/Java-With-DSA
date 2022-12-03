import java.util.*;

public class InputOutputInStrings
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            String name;
            // name = sc.next();        // only take one word
            name = sc.nextLine();       // takes whole line as input
            System.out.println(name);
        }
    }
}