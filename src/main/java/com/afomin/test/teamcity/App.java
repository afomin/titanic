package com.afomin.test.teamcity;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println("Hello World! Current titanic version is: " + new Titanic().getVersion());
    }
}
