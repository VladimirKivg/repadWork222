package repadWork_interf;

import weapon.Ak47;

public class Mi82 extends Helicopter2{

public void flyWeapon(){
    Ak47 ak47=new Ak47();
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
        System.out.println("Вертолет Mi8 вертикальный взлет");
    }
}
