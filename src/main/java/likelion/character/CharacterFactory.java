package likelion.character;


import likelion.weapon.Bow;
import likelion.weapon.FireWand;
import likelion.weapon.IceWand;
import likelion.weapon.Sword;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<String, UserCharacter> store = new HashMap<>();

    static {
        store.put("칼전사", new Warrior(new Sword()));
        store.put("활전사", new Warrior(new Bow()));
        store.put("불마법사", new Wizard(new FireWand()));
        store.put("얼음마법사", new Wizard(new IceWand()));
    }

    public static UserCharacter get(String name) {
        return store.get(name);
    }
}
