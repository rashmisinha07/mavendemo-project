package com.learnmaven.mavendemo;

/**
 * Hello world!
 *
 */
import org.apache.log4j.*;
public class App 
{
	final static Logger logger=Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(new Calculator().add(3, 2));
        System.out.println(new Calculator().Subtract(3, 2));
        System.out.println(new Calculator().Multi(3, 2));
        System.out.println(new Calculator().div(3, 2));
        
        logger.debug(new Calculator().add(10, 5));
        logger.debug(new Calculator().Subtract(10, 5));
        logger.debug(new Calculator().Multi(10, 5));
        logger.debug(new Calculator().div(10, 5));
        
        
    }
}
