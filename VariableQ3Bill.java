import java.util.*;

public class VariableQ3Bill
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float pencil_price = sc.nextFloat();
        float pen_price = sc.nextFloat();
        float eraser_price = sc.nextFloat();
        float total_price_without_GST = pencil_price + pen_price + eraser_price;
        float total_price_with_GST = (pencil_price + pen_price + eraser_price) + (float)0.18 * (pencil_price + pen_price + eraser_price);
        System.out.println(total_price_without_GST);
        System.out.println(total_price_with_GST);
    }
}