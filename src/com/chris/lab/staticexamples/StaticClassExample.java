package com.chris.lab.staticexamples;

public class StaticClassExample {

    public static String message = "meant for transportation";

    public static class sedans {

        public void printMessage() {
            System.out.println("Cars are" + message);
        }
    }

}

/*
 * In Java, only nested classes can be declared as static classes. If we attempt
 * to declare a top-level class as a static class, we will get an error. What
 * are static classes? Static classes are nested classes that act like top-level
 * classes, even if they appear somewhere in the middle or the bottom of the
 * program hierarchy (within a class). Static classes do not need the reference
 * of the outer class. They act like an outer class within themselves. Normal
 * non-static nested classes, on the other hand, need reference of the outer
 * class. In other words, static classes are independent of the outer class,
 * while other inner classes are dependent on the outer class.
 */
