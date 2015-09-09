package com.chris.lab.staticexamples;

public class StaticExample {

    public static int count = 0;

    public void increment() {
        count++;
    }

    /*
     * Static variable�s value is same for all the object(or instances) of the
     * class or in other words you can say that all instances(objects) of the
     * same class share a single copy of static variables.
     */
    public static String concat(String x, String y) {
        String z = x + y;
        return z;

    }
}
