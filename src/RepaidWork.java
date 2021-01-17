import repadWork_interf.*;
import weapon.Ak47;
import weapon.Makarov;
import weapon.Rifle;
import weapon.Test;

public class RepaidWork {
    public static void main(String[] args) {

        Mi82 mi8=new Mi82();
        Boeing749 boeing747=new Boeing749();
        Test2 test=new Test2();

        test.foo((FlingObject2) mi8);
        test.foo((FlingObject2) mi8);

        test.foo(boeing747);

        Ak47 ak47=new Ak47();
        Test test1=new Test();
        Rifle rifle=new Rifle();
        Makarov makarov=new Makarov();

        test1.foo(ak47,ak47);
        System.out.println();
        test1.foo(makarov,makarov);
        System.out.println();
        test1.foo(ak47);

        Test22<Ak47>test22=new Test22<Ak47>(test,ak47);
        test22.getTest2().foo((VerticalTakeoff2) mi8);
        test22.getGen().weapon();
        test22.getTest2().foo((FlingObject2) mi8);
        System.out.println("(-:");
        mi8.flyWeapon();
        System.out.println(":-)");
        test22.getTest2();

    }

    private static class Mi8 {
    }

}
