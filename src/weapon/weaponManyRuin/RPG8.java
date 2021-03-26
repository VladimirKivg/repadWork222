package weapon.weaponManyRuin;

import weapon.Weapon;
import weapon.WorkWeapon;
import weapon.typeWeapon.ManyRuin;

public class RPG8 extends ManyRuin implements WorkWeapon {
    public void fooRPG8(Weapon e) {
        e.fooWeapon(e);
            System.out.println("RPG8");
        workWeapon();
    }

    @Override
    public void workWeapon() {
        System.out.println("взриває танки нахрін");
    }

    @Override
    public void weapon() {
        super.weapon();
        System.out.println("їбашить пиздєц");
    }
}
