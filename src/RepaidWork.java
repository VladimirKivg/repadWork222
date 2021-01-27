import weapon.Test;
import weapon.weaponRifle.Ak47;
import weapon.weaponRifle.Makarov;

public class RepaidWork {
    public static void main(String[] args) {

        Ak47 ak47 = new Ak47();
        ak47.fooAk47(ak47);
        System.out.println();
        Test test = new Test();// З данної рохкладки тест взагалі можна відалити
test.fooTest(ak47,ak47);
        Makarov makarov =new Makarov();
        test.fooTest(makarov);
        System.out.println();
        makarov.fooWeapon(makarov);
        System.out.println();
        makarov.fooMakarov(makarov);
    }

    private static class Mi8 {
    }

}
