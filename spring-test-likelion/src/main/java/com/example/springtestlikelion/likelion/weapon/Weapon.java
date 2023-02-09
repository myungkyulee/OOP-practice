package com.example.springtestlikelion.likelion.weapon;

public abstract class Weapon {
    protected final String name;
    protected final Integer power;

    public Weapon(String name, Integer power) {
        this.name = name;
        this.power = power;
    }
    public void use(String characterName, Integer characterPower) {
        StringBuilder sb = new StringBuilder();
        sb.append(characterName)
                .append("(이)가 ")
                .append(name)
                .append("(으)로 공격합니다.\n")
                .append("데미지 : ")
                .append(characterName)
                .append(" 기본공격력(")
                .append(characterPower)
                .append(") * ")
                .append(name)
                .append(" 공격력(")
                .append(power)
                .append(") => ")
                .append(characterPower * power)
                .append("\n");

        System.out.printf(sb.toString());
    }
}

