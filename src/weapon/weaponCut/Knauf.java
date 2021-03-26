package weapon.weaponCut;

import weapon.WorkWeapon;
import weapon.typeWeapon.Cut;

public class    Knauf extends Cut implements WorkWeapon {
    @Override
    public void workWeapon() {
        System.out.println("исползует спецназ разных стран" +
                " как оружие для ближнего боя,");
        System.out.println("или последняя надежда на выжевание");
    }

    @Override
    public void weapon() {
        super.weapon();
        System.out.println("просто очень хороший нож");
        workWeapon();
    }
}
