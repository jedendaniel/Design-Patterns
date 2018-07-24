package com.java.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class EnemyGroup extends EnemyGroupComponent {

    private String groupName;
    private List<EnemyGroupComponent> members = new ArrayList();

    public EnemyGroup(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void add(EnemyGroupComponent enemyGroupComponent) {
        members.add(enemyGroupComponent);
    }

    @Override
    public void remove(EnemyGroupComponent enemyGroupComponent) {
        members.remove(enemyGroupComponent);
    }

    @Override
    public EnemyGroupComponent getComponent(int index) {
        return members.get(index);
    }

    @Override
    public String getGroupName() {
        return groupName;
    }


    @Override
    public String getInfo(int row) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getTab(row) + "< " + groupName + ":\n");
        for (EnemyGroupComponent e: members) {
            stringBuilder.append(e.getInfo(row+1));
        }
        return stringBuilder.toString();
    }
}
