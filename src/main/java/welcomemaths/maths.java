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
    God helo()
    {
        try
        {
            return (God) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println("cloned error");
            return this;
        }
    }
}

public class Maths
{
    private static Scanner scan;

	public static void main( String[] args ){
    	scan = new Scanner(System.in);
        System.out.println("enter x coordinate");
        Integer a = scan.nextInt();
        System.out.println("Enter y coordinate");
        Integer b = scan.nextInt();
        God s1 = new God(a, b);
        God s2 = s1.helo();
        s2.active();
    }
}
