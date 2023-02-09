package com.example.springtestlikelion.likelion.weapon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {
    @DisplayName("무기는 여러 무기에 따라 다르게 사용된다. ")
    @Test
    void test() {
        Weapon sword = new Sword();
        Weapon bow = new Bow();
        Weapon fireWand = new FireWand();
        Weapon iceWand = new IceWand();

        sword.use("전사", 10);
        bow.use("전사", 10);
        fireWand.use("마법사", 5);
        iceWand.use("마법사", 5);
    }

}