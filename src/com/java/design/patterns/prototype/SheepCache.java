package com.java.design.patterns.prototype;

import com.java.design.patterns.sheep.BlackSheep;
import com.java.design.patterns.sheep.Sheep;
import com.java.design.patterns.sheep.SuperSheep;

import java.util.Hashtable;

public class SheepCache {
    private static Hashtable<String,Sheep> sheepMap = new Hashtable<>();

    public static Sheep getSheep(String id){
        Sheep cachedSheep = sheepMap.get(id);
        System.out.println("Cloning sheep with id " + id);
        return (Sheep)cachedSheep.clone();
    }

    public static void loadCache(){
        BlackSheep blackSheep = new BlackSheep();
        blackSheep.setId("1");
        sheepMap.put(blackSheep.getId(), blackSheep);

        SuperSheep superSheep = new SuperSheep();
        superSheep.setId("2");
        sheepMap.put(superSheep.getId(), superSheep);
    }
}
