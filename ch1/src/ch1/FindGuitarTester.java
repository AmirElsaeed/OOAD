/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class FindGuitarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        
        GuitarSpec guitarSpec = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
        List matchingGuitars = inventory.search(guitarSpec);
        if(!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for(Iterator iter= matchingGuitars.iterator(); iter.hasNext();) {
                Guitar guitar = (Guitar)iter.next();
                GuitarSpec spec = guitar.getGuitarSpec();
                System.out.println("We have a " +
                    spec.getBuilder() + " " + spec.getModel() + " " + spec.getNumString() + "-string " +
                    spec.getType() + " guitar:\n" + 
                    spec.getBackWood() + " back and sides,\n" + 
                    spec.getTopWood() + " top.\nYou can have it for only $" +
                    guitar.getPrice() + "!\n-----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }
    
    private static void initializeInventory(Inventory inventory) {
        // add guitars to inventory 
        inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6));
        inventory.addGuitar("V9512", 1549.20, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6));
    }
}
