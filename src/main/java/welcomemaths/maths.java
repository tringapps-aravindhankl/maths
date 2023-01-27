package welcomemaths;
import java.util.*;

class God implements Cloneable {
    Integer x;
    Integer y;

    God(Integer a, Integer b) {
        x = a;
        y = b;
    }

    void active() {
        Boolean c = x.equals(y);
        System.out.println(c);
    }

    public Object well() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Maths
{
    private static Scanner scan;

	public static void main( String[] args )throws CloneNotSupportedException{
    	scan = new Scanner(System.in);
        System.out.println("enter x coordinate");
        Integer a = scan.nextInt();
        System.out.println("Enter y coordinate");
        Integer b = scan.nextInt();
        God s1 = new God(a, b);
        God s2 = (God)s1.clone();
        s2.active();
    }
}
