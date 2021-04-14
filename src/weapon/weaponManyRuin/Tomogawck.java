package weapon.weaponManyRuin;

import weapon.Weapon;
import weapon.WorkWeapon;
import weapon.typeWeapon.ManyRuin;

public class Tomogawck extends ManyRuin implements WorkWeapon {

    public void fooTomogawck(Weapon e) {
        e.fooWeapon(e);
        System.out.println("ракета томогавк");
        workWeapon();
    }

    @Override
    public void workWeapon() {
        System.out.println("дуже ахрінітільна ракета");
        System.out.println("знищує цілі на великій вадстані");
    }
}
