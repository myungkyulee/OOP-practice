package likelion.character;


import likelion.weapon.Weapon;

public class Wizard extends UserCharacter {
    public Wizard(Weapon weapon) {
        this.weapon = weapon;
        this.power = 5;
        this.name = "마법사";
    }

    @Override
    public void attack() {
        weapon.use(name, power);
    }
}
