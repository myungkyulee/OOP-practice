package com.example.springtestlikelion.likelion;


import com.example.springtestlikelion.likelion.character.CharacterFactory;
import com.example.springtestlikelion.likelion.character.UserCharacter;

public class Game {
    public static void main(String[] args) {
        UserCharacter character = CharacterFactory.get("칼전사");
        character.attack();

        character = CharacterFactory.get("활전사");
        character.attack();

        character = CharacterFactory.get("불마법사");
        character.attack();

        character = CharacterFactory.get("얼음마법사");
        character.attack();
    }
}
