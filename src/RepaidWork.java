import weapon.Test;
import weapon.weaponRifle.Ak47;
import weapon.weaponRifle.Makarov;

public class RepaidWork {
    public static void main(String[] args) {

        Ak47 ak47 = new Ak47();
        ak47.fooAk47(ak47);
        System.out.println();
        Makarov makarov =new Makarov();
        Test <Ak47,Makarov>test = new Test(ak47,makarov);// З данної рохкладки тест взагалі можна відалити
//test.fooTest(ak47,ak47);
     //   Makarov makarov =new Makarov();
      //  test.fooTest(makarov);
        System.out.println();
        makarov.fooWeapon(makarov);
        System.out.println();
        makarov.fooMakarov(makarov);
test.getT().fooAk47(ak47);// тут класс test єксперементальнмй щось подібне краще проробіти з літальнімі апаратамі
  test.getG().fooMakarov(makarov);
    }

    private static class Mi8 {
    }

}
