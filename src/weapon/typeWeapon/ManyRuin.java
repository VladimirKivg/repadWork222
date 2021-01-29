package weapon.typeWeapon;

import weapon.Weapon;
import weapon.WorkWeapon;

public class  ManyRuin extends Weapon implements WorkWeapon {

    @Override
    public void weapon() {
        System.out.println("стріляє снарядами");
    }

    @Override
    public void workWeapon() {
        System.out.println("взриває все нахрін");

    }
}
