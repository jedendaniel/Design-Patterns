package com.java.design.patterns.visitor;

import com.java.design.patterns.sheep.BlackSheep;
import com.java.design.patterns.sheep.SuperSheep;

public interface Visitor {
    void visitBlackSheep(BlackSheep blackSheep);
    void visitSuperSheep(SuperSheep superSheep);
}
