package com.java.design.patterns.facade;

import com.java.design.patterns.sheep.BlackSheep;
import com.java.design.patterns.sheep.SuperSheep;

public class BleatMaker {
    private BlackSheep blackSheep;
    private SuperSheep superSheep;

    public BleatMaker() {
        blackSheep = new BlackSheep();
        superSheep = new SuperSheep();
    }

    public void MakeBlackSheepBleat(){
        System.out.println("This is how black sheep bleat:");
        blackSheep.bleat();
    }

    public void MakeSuperSheepBleat(){
        System.out.println("This is how super sheep bleat:");
        superSheep.bleat();
    }
}
