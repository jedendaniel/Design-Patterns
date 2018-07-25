package com.java.design.patterns.memento;

import com.java.design.patterns.character.Character;

import java.util.HashMap;

public class CharacterSavesManager {
    private HashMap<String, CharacterStateEntry> characterStateEntries = new HashMap<>();

    public void save(String entryName, Character character){
        characterStateEntries.put(entryName, new CharacterStateEntry(new Character(character)));
    }

    public CharacterStateEntry restore(String entryName){
        System.out.println("Loading " + entryName + "...");
        return characterStateEntries.get(entryName);
    }
}
