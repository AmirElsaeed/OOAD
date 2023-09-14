/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

/**
 *
 * @author user
 */
public class BarkRecognizer {
    private DogDoor door;
    
    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }
    
    public void recognize(String bark) {
        System.out.println(" BarkRecognizer heard a '" + bark + "'");
        door.open();
    }
}
