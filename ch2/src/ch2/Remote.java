/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author user
 */
public class Remote {

    private DogDoor door;
    public Remote(DogDoor door) {
        this.door = door;
    }
    
    public void pressButton() {
        System.out.println("Pressing the remote control button ...");
        if(door.isOpen()) {
            door.close();
        } else {
            door.open();
        }
    }
}
