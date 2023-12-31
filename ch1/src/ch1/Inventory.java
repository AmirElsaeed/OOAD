/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user
 */
public class Inventory {
    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }
    
    public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }
    
    public Guitar getGuitar(String serialNumber) {
        for(Iterator iter = guitars.iterator(); iter.hasNext();) {
            Guitar guitar = (Guitar)iter.next();
            if(guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }
    
    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList(); 
        for(Iterator iter = guitars.iterator(); iter.hasNext();) {
            Guitar guitar = (Guitar)iter.next();
            if(guitar.getGuitarSpec().matches(searchSpec))
                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}
