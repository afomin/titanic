package com.afomin.test.teamcity;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println("Current titanic version is: " + new Titanic().getVersion());
    }
}
