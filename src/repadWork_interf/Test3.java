package repadWork_interf;

import repadWork_interf.flyAircraft.Mriya;
import repadWork_interf.flyHelicopter.Mi82;

public class Test3 {

    public static void main(String[] args) {
        Mi82 mi82 = new Mi82();
        mi82.flyWeapon();
           Test2 test2=new Test2();
        test2.boeing();
        System.out.println("_______________________");
        Mriya mriya=new Mriya();
        mriya.gorizontTakeoff();
mi82.verticalTakeoff2();
    }


}
