package com.java.design.patterns.visitor;

import com.java.design.patterns.sheep.BlackSheep;
import com.java.design.patterns.sheep.SuperSheep;

public class Inspiration implements Visitor {
    @Override
    public void visitBlackSheep(BlackSheep blackSheep) {
        System.out.println("Black sheep gets inspired and is doing incredible things");
    }

    @Override
    public void visitSuperSheep(SuperSheep superSheep) {
        System.out.println("Super sheep gets inspired and is tweeting like a bird");
    }
}
