package com.example.springtestlikelion.likelion.character;


import com.example.springtestlikelion.likelion.weapon.Weapon;

public class Warrior extends UserCharacter {
    public Warrior(Weapon weapon) {
        this.weapon = weapon;
        this.power = 10;
        this.name = "전사";
    }

    @Override
    public void attack() {
        weapon.use(name, power);
    }
}
