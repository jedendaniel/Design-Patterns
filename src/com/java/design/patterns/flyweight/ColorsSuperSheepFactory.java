package com.java.design.patterns.flyweight;

import com.java.design.patterns.sheep.SuperSheep;

import java.util.HashMap;

public class ColorsSuperSheepFactory {
    private static final HashMap superSheepMap = new HashMap();

    public static SuperSheep getSuperSheep(String color){
        SuperSheep superSheep = (SuperSheep)superSheepMap.get(color);

        if(superSheep == null){
            superSheep = new SuperSheep();
            superSheep.setColor(color);
            superSheepMap.put(color,superSheep);
            System.out.println("Creating super sheep of color " + color);
        }
        else{
            System.out.println("Using super sheep from map..");
        }
        return superSheep;
    }
}
