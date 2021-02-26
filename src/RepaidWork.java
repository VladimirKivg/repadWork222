import weapon.Test;
import weapon.weaponCut.Sword;
import weapon.weaponManyRuin.RPG8;
import weapon.weaponManyRuin.Tomogawck;
import weapon.weaponRifle.Ak47;
import weapon.weaponRifle.Makarov;

public class RepaidWork {
    public static void main(String[] args) {

        Ak47 ak47 = new Ak47();
        ak47.fooAk47(ak47);
        System.out.println();
        Makarov makarov = new Makarov();
        Test<Ak47, Makarov> test = new Test(ak47, makarov);// З данної рохкладки тест взагалі можна відалити
//test.fooTest(ak47,ak47);
        //   Makarov makarov =new Makarov();
        //  test.fooTest(makarov);
        System.out.println();
        makarov.fooWeapon(makarov);
        System.out.println();
        makarov.fooMakarov(makarov);
        test.getT().fooAk47(ak47);// тут класс test єксперементальнмй щось подібне краще проробіти з літальнімі апаратамі
        System.out.println("що тут");
        test.getG().fooMakarov(makarov);

        RPG8 rpg8 = new RPG8();
        rpg8.fooRPG8(rpg8);
        Tomogawck tomogawck = new Tomogawck();
        tomogawck.fooTomogawck(tomogawck);
//        rpg8.weapon();
//rpg8.fooWeapon(rpg8);

        Sword sword = new Sword();
        sword.fooWeapon(sword);
    }

    private static class Mi8 {
    }

}
