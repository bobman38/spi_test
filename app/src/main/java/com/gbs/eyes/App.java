package com.gbs.eyes;

import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        System.out.println( "Hello World!" );
        
        ServiceLoader<Crystal> loader = ServiceLoader.load(Crystal.class);
        
        for (Crystal crystal : loader) {
        	crystal.scanDoc("myDoc");
			
		}
        
        System.out.println( "Hello World2!" );

    }
}
