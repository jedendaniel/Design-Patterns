package com.java.design.patterns.composite;

public abstract class EnemyGroupComponent {

    public void add(EnemyGroupComponent enemyGroupComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(EnemyGroupComponent enemyGroupComponent){
        throw new UnsupportedOperationException();
    }

    public EnemyGroupComponent getComponent(int index){
        throw new UnsupportedOperationException();
    }

    public String getGroupName(){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getInfo(int row){
        throw new UnsupportedOperationException();
    }

    protected String getTab(int row){
        String tabulator = new String();
        for(int i = 0; i < row; i++){
            tabulator += "\t";
        }
        return tabulator;
    }
}
