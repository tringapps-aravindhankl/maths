package welcomemaths;
import java.util.*;
import java.util.logging.*;

public class Maths
{
	public static void main( String[] args )
	{
    	Scanner scan = new Scanner(System.in);
	    Logger log=Logger.getLogger("hi");
        log.info("enter x coordinate");
        Integer firstcoordinate = scan.nextInt();
        log.info("Enter y coordinate");
        Integer secondcoordinate = scan.nextInt();
        Graph s1 = new Graph(firstcoordinate, secondcoordinate);
        Graph s2 = s1.helo(); //clone(copy of an object)
        s2.active();
    }
}
