package com.yun.firstcloud.firstcloud;

import java.util.UUID;

/**
 * Generate a unique number
 *
 */
public class App 
{

    public static void main( String[] args ) throws InterruptedException
    {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
    }
    
    public String generateUniqueKey() throws InterruptedException{
    	
    	String id = UUID.randomUUID().toString();	
    	Thread.sleep(60000);
    	return id;
    	
    }
}
