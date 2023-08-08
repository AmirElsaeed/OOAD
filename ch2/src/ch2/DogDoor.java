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
public class DogDoor {
    private boolean open;
    
    public DogDoor() {
        this.open = false;
    }
    
    public void open() {
        System.out.println("The dog door opens.");
        open = true;
        
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }
    
    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }
    
    public boolean isOpen() {
        return open;
    }
}
