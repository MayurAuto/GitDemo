package TestPack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLog {
    public static Logger log = LogManager.getLogger(DemoLog.class.getName());
    public static void main(String args[]){
        log.info("Hey");
        log.error("This is an Error log");
        log.debug("This is a debug log");
        log.info("Hey mayur this side");
    }
}
