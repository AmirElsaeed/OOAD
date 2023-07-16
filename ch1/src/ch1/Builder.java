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
public enum Builder {
    FENDER, MARIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
    
    public String toString() {
        switch(this) {
            case FENDER: return "fender";
            case MARIN: return "marin";
            case GIBSON: return "gibson";
            case COLLINGS: return "collings";
            case OLSON: return "olson";
            case RYAN: return "ryan";
            case PRS: return "prs";
            case ANY: return "any";
            default: return "fender";
        }
    }
}
