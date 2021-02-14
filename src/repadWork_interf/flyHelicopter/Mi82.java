package repadWork_interf.flyHelicopter;

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
    System.out.println( Mi82.super.getName());

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
