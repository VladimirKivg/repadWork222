package repadWork_interf;

import repadWork_interf.tupFly.Helicopter2;
import weapon.weaponRifle.Ak47;

public class Mi82 extends Helicopter2 {

public void flyWeapon(){
    Ak47 ak47=new Ak47();
    fly();
    verticalTakeoff();
    System.out.println("оснащення:");
    ak47.weapon();
    Mi82.super.setName("безобидный");
}
    @Override
    public void fly() {
        System.out.println("Вертолет Mi8");

    }

    @Override
    public void verticalTakeoff() {
        System.out.println(" вертикальный взлет");
    }
}
