package welcomemaths;

import java.util.logging.Level;
import java.util.logging.Logger;

class Graph implements Cloneable {
	    Integer NumberX;
	    Integer NumberY;
	    Logger log=Logger.getLogger("hi");

	    Graph(Integer FirstNumber, Integer SecondNumber) {
	       this.NumberX= FirstNumber;
	       this.NumberY= SecondNumber;
	    }

	    void active() {
	        boolean condition = NumberX.equals(NumberY);
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
