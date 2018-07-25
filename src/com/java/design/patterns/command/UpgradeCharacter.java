package com.java.design.patterns.command;

import com.java.design.patterns.character.Character;

public class UpgradeCharacter extends Command {

    private Character character;

    public UpgradeCharacter(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.upgradeLevel();
        System.out.println("Logg_" + date.getTime() + "_cmd+up_" + character.getName() + "_lvl_" + character.getLevel());
    }
}
