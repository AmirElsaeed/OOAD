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
public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
    MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, STIKA;
    
    public String toString() {
        switch(this) {
            case INDIAN_ROSEWOOD: return "indian_rosewood";
            case BRAZILIAN_ROSEWOOD: return "brazilian_rosewood";
            case MAHOGANY: return "mahogany";
            case MAPLE: return "maple";
            case COCOBOLO: return "cocobolo";
            case CEDAR: return "cedar";
            case ADIRONDACK: return "adirondack";
            case ALDER: return "alder";
            case STIKA: return "stika";
            default: return "indian_rosewood";
        }
    }
}
