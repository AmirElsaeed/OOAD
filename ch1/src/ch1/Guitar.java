/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1;

/**
 *
 * @author user
 */
public class Guitar {
    
    private String serialNumber;
    private double price;
    private GuitarSpec guitarSpec;
    
    public Guitar() {}
    
    public Guitar(GuitarSpec guitarSpec) {
        this.guitarSpec = guitarSpec;
    }
    
    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }
}
