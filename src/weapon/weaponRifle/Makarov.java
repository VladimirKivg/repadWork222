package weapon.weaponRifle;

import weapon.Weapon;
import weapon.typeWeapon.Rifle;
import weapon.WorkWeapon;

public class Makarov extends Rifle implements WorkWeapon {
    @Override
    public void weapon() {
      //  fooMakarov();
        super.weapon();

    }
    private void fooMakarov(Weapon e){
        System.out.println("пістолет Макаров");
        e.fooWeapon(e);
        workWeapon();
    }
    @Override
    public void workWeapon() {

        System.out.println("це пістоле, не автомат звичайно," +
                " але краще ніж нічого");
    }


}
