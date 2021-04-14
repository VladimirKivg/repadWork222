package weapon.weaponCut;

import weapon.WorkWeapon;
import weapon.typeWeapon.Cut;

public class Sword extends Cut implements WorkWeapon {
    @Override
    public void weapon() {
        super.weapon();
        System.out.println("очень острый и удобный меч," +
                "с смещенным центром тяжости, " +
                "и хорошо отбалансирован");
        workWeapon();
    }

    @Override
    public void workWeapon() {
        System.out.println("исползуют ниньзя и сомураи");
    }

}
