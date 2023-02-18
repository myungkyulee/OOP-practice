package likelion.character;

import likelion.weapon.Bow;
import likelion.weapon.Weapon;


public abstract class UserCharacter {
    protected String name;
    protected Weapon weapon;
    protected Integer power;

    public void setWeapon(Bow weapon) {
        this.weapon = weapon;
    }

    public abstract void attack();
}
