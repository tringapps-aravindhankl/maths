package welcomemaths;
import java.util.*;

class god implements Cloneable {
    Integer x;
    Integer y;

    god(Integer a, Integer b) {
        x = a;
        y = b;
    }

    void equal() {
        Boolean c = x.equals(y);
        System.out.println(c);
    }

    protected Object clone()throws CloneNotSupportedException {
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
        god s1 = new god(a, b);
        god s2 = (god)s1.clone();
        s2.equal();
    }
}
