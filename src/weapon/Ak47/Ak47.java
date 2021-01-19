package weapon.Ak47;

import weapon.typeWeapon.Rifle;
import weapon.WorkWeapon;

public class Ak47 extends Rifle implements WorkWeapon {
    @Override
    public void weapon() {
        ak47();
        super.weapon();
        workWeapon();
    }

    private void ak47(){

        System.out.println("Ak47");
    }

    @Override
    public void workWeapon() {
        System.out.println("це автомат, але дуже зручний");
    }
}
