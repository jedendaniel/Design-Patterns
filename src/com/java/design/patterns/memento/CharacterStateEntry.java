package com.java.design.patterns.memento;

import com.java.design.patterns.character.Character;

import java.util.Date;

public class CharacterStateEntry {
    private Character characterState;

    public CharacterStateEntry(Character characterState) {
        this.characterState = characterState;
    }

    public Character getCharacterState() {
        return characterState;
    }

    public void setCharacterState(Character characterState) {
        this.characterState = characterState;
    }
}
