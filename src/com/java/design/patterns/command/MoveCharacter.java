package com.java.design.patterns.command;

import com.sun.javafx.geom.Vec2f;
import com.java.design.patterns.character.Character;

import java.util.Date;

public class MoveCharacter extends Command {
    private Character character;
    private Vec2f destination;
    private Date date = new Date();

    public MoveCharacter(Character character, Vec2f destination) {
        this.character = character;
        this.destination = destination;
    }

    @Override
    public void execute() {
        character.move(destination);
        System.out.println("Logg_" + date.getTime() + "_cmd+move_" + character.getName() + "_dest_" + destination);
    }
}
