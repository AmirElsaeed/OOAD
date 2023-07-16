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
public class GuitarSpec {
    
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood, topWood;
    private int numString;
    
    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numString = numString;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumString() {
        return numString;
    }
    
    public boolean matches(GuitarSpec otherSpec) {
        if(builder != otherSpec.getBuilder())
            return false;

        if(model != null && !model.equals("") && !model.equals(otherSpec.getModel()))
            return false;

        if(type != otherSpec.getType())
            return false;

        if(backWood != otherSpec.getBackWood())
            return false;

        if(topWood != otherSpec.getTopWood())
            return false;
        
        if(numString != otherSpec.getNumString())
            return false;
        
        return true;
    }
}
