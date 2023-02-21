package welcomemaths;
import java.util.*;
import java.util.logging.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Graph implements cloneable {
	    Integer coordinatex;
	    Integer coordinatey;
	    Logger log=Logger.getLogger("hi");

	    Graph(Integer a, Integer b) {
	       coordinatex = a;
	       coordinatey= b;
	    }

	    void active() {
	        boolean condition = coordinatex.equals(coordinatey);
	        log.log(Level.INFO,()->" "+condition);
	    }
	    Graph helo()
	    {
	        try
	        {
	            return (Graph) super.clone();
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
	public static void main( String[] args )
	{
    	Scanner scan = new Scanner(System.in);
	    Logger log=Logger.getLogger("hi");
        log.info("enter x coordinate");
        Integer firstcoordinate = scan.nextInt();
        log.info("Enter y coordinate");
        Integer secondcoordinate = scan.nextInt();
        Graph s1 = new Graph(firstcoordinate, secondcoordinate);
        Graph s2 = s1.helo();
        s2.active();
    }
}
