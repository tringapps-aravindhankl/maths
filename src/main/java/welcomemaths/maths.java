package welcomemaths;
import java.util.*;
import java.util.logging.*;

class God implements cloneable {
    Integer x;
    Integer y;
    Logger log=Logger.getLogger("hi");

    God(Integer a, Integer b) {
        x = a;
        y = b;
    }

    void active() {
        Boolean c = x.equals(y);
        log.info(c);
    }
    God helo()
    {
        try
        {
            return (God) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            log.info("cloned error");
            return this;
        }
    }
}

public class Maths
{
    private static Scanner scan;

	public static void main( String[] args ){
    	scan = new Scanner(System.in);
	Logger log=Logger.getLogger("hi");
        log.info("enter x coordinate");
        Integer a = scan.nextInt();
        log.info("Enter y coordinate");
        Integer b = scan.nextInt();
        God s1 = new God(a, b);
        God s2 = s1.helo();
        s2.active();
    }
}
