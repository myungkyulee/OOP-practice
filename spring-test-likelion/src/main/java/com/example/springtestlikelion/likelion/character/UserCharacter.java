package com.example.springtestlikelion.likelion.character;

import com.example.springtestlikelion.likelion.weapon.Bow;
import com.example.springtestlikelion.likelion.weapon.Weapon;


public abstract class UserCharacter {
    protected String name;
    protected Weapon weapon;
    protected Integer power;

    public void setWeapon(Bow weapon) {
        this.weapon = weapon;
    }

    public abstract void attack();
}
