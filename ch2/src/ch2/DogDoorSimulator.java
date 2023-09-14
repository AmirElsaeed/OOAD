/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);
        
        // Simulate hardware hearing bark
        System.out.println("Fido starts barking.");
        recognizer.recognize("woof");
        
        System.out.println("\nFido has gone outside ...");        
        System.out.println("\nFido's all done ...");
        
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(DogDoorSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("... but he's stuck outside!");
        System.out.println("\nFido starts barking...");
        recognizer.recognize("woof");
        System.out.println("\nFido's back inside ...");
        
        
        
//        // remote
//        System.out.println("Fido barks to go outside ...");
//        remote.pressButton();
//      
//        System.out.println("\nFido has gone outside ...");
//
//        System.out.println("\nFido's all done ...");
//
//        try {
//            Thread.currentThread().sleep(10000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(DogDoorSimulator.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        System.out.println("... but he's stuck outside!");
//        System.out.println("\nFido starts barking...");
//        System.out.println("... so Gina grabs the remote control.");
//        remote.pressButton();
//        System.out.println("\nFido's back inside ...");
    }
}