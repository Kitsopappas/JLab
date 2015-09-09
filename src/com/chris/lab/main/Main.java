/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chris.lab.main;

import com.chris.lab.vectorsexample.VectorExample;

/**
 *
 * @author xristos
 */
public class Main {

    public static void main(String[] args) {
        //abstract example - start
      /*  System.out.println("Abstract example - start");
        ElectricGuitar guitar = new ElectricGuitar();
        ElectricBassGuitar bassGuitar = new ElectricBassGuitar();

        guitar.play();
        bassGuitar.play();

        guitar = new ElectricGuitar(7);
        bassGuitar = new ElectricBassGuitar(5);

        guitar.play();
        bassGuitar.play();
        System.out.println("Abstract example - end");
        //abstract example - end
        //interface example - start
        System.out.println("Interface example - start");
        Dog d = new Dog();
        d.eat();
        d.travel();
        System.out.println("Interface example - end");
        //interface example - end
        //static examples - start
        System.out.println("Static examples - start");
        // Static variable example
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        obj1.increment();
        obj1.increment();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj1: count is=" + obj1.count);
        System.out.println("Obj2: count is=" + obj2.count);
        // static method vs instance method
        display();
        Main m = new Main();
        m.show();
        // static method from another class,by whriting only the class name!
        System.out.println(StaticExample.concat("Java is ", "awesome"));
        // Static class example
        StaticClassExample.sedans text = new StaticClassExample.sedans();
        text.printMessage();
        System.out.println("Static examples - end");
        //static examples - end
*/
        VectorExample ve = new VectorExample();
        
    }

    // static method example
    static void display() {
        System.out.println("Java is my favorite programming language.");
    }

    void show() {
        System.out.println("Java is awesome.");
    }
    /*
     * static methods in Java can be called without creating an object of class.
     * Have you noticed why we write static keyword when defining main it's
     * because program execution begins from main and no object has been created
     * yet.
     */
}
