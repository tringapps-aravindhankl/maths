package welcomemaths;

import java.util.logging.Level;
import java.util.logging.Logger;

class Graph implements cloneable {
	    Integer numberx;
	    Integer numbery;
	    Logger log=Logger.getLogger("hi");

	    Graph(Integer firstnumber, Integer secondbnumber) {
	       this.numberx= firstnumber;
	       this.numbery= secondnumber;
	    }

	    void active() {
	        boolean condition = Numberx.equals(Numbery);
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
