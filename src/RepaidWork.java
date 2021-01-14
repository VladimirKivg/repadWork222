import repadWork_interf.Boeing749;
import repadWork_interf.Mi82;
import repadWork_interf.Test2;
import weapon.Ak47;
import weapon.Makarov;
import weapon.Rifle;
import weapon.Test;

public class RepaidWork {
    public static void main(String[] args) {

        Mi82 mi8=new Mi82();
        Boeing749 boeing747=new Boeing749();
        Test2 test=new Test2();
        test.foo(mi8);
        test.foo(boeing747);


        Ak47 ak47=new Ak47();
        Test test1=new Test();
        Rifle rifle=new Rifle();
        Makarov makarov=new Makarov();

        test1.foo(ak47,ak47);
        test1.foo(makarov,makarov);
        test1.foo(ak47);

    }

    private static class Mi8 {
    }

}
