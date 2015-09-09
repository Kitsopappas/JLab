/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chris.lab.vectorsexample;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author xristos
 */
public class VectorExample {

    public VectorExample() {

        Scanner scan = new Scanner(System.in);

        Vector<String> myVector = new Vector<String>(); 

        String word = "";      

        //giomise ton vectora
        for (int i = 0; i <= myVector.size(); i++) {

            System.out.print("\n Type exit to stop the loop , Enter a word  :");

            word = scan.nextLine();            

            if (word.equals("exit")) {               //stamataei to gurw gurw
                break;

            }

            myVector.add(word);             //crap vector in yo

        }

      
        for (int i = 0; i < myVector.size(); i++) {      

            System.out.print("\n      " + myVector.get(i));

        }
    }

}
