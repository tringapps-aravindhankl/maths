package welcomemaths;
import java.util.*;

import java.util.logging.*;
class Graph implements Cloneable {
    Integer Numberone;
    Integer Numbertwo;
    Logger log=Logger.getLogger("hi");

    Graph(Integer FirstNumber, Integer SecondNumber) {
       this.Numberone= FirstNumber;
       this.Numbertwo= SecondNumber;
    }

    void active() {
        boolean condition = Numberone.equals(Numbertwo);
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
            log.info("Cloned error");
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
        Graph s2 = s1.helo(); //clone(copy of an object)
        s2.active();
    }
}
