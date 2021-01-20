package repadWork_interf;

import weapon.takeWeapon.Ak47;

public class Mi82 extends Helicopter2{

public void flyWeapon(){
    Ak47 ak47=new Ak47();
    fly();
    verticalTakeoff();
    System.out.println("оснащення:");
    ak47.weapon();
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
