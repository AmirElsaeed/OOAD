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
public enum Type {
    ACOUSTIC, ELECTRIC;
    
    public String toString() {
        switch(this) {
            case ACOUSTIC: return "acoustic";
            case ELECTRIC: return "electric";
            default: return "acoustic";
        }
    }
}
