package weapon.weaponRifle;

import weapon.Weapon;
import weapon.typeWeapon.Rifle;
import weapon.WorkWeapon;

public class Ak47 extends Rifle implements WorkWeapon {
    @Override
    public void weapon() {
       // ak47();
        super.weapon();
        workWeapon();
    }

    public void fooAk47(Weapon e){
        System.out.println("Ak47");
        e.fooWeapon(e);

      //  e.weapon();
       // e.foo(e);
    }

    @Override
    public void workWeapon() {
        System.out.println("це автомат, але дуже зручний");
    }
}
