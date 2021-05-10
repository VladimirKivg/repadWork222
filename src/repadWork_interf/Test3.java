package repadWork_interf;

import repadWork_interf.flyAircraft.Boeing749;
import repadWork_interf.flyAircraft.Mriya;
import repadWork_interf.flyAircraft.Tu124;
import repadWork_interf.flyHelicopter.Mi82;

public class Test3 {

    public static void main(String[] args) {
        Mi82 mi82 = new Mi82();
        mi82.flyWeapon();
        Test2 test2 = new Test2();
        test2.boeing();
        System.out.println("_______________________");
        Mriya mriya = new Mriya();
        mriya.gorizontTakeoff();
        mi82.verticalTakeoff2();
        System.out.println("________________________");
        Tu124 tu124 = new Tu124();
        tu124.max();
        tu124.gorizontTakeoff();
        System.out.println("_________________________");
        Boeing749 boeing749 = new Boeing749();
        boeing749.fly();
        boeing749.flyWor();
    }


}
