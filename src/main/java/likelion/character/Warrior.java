package likelion.character;


import likelion.weapon.Weapon;

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
