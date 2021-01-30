package weapon;

import weapon.typeWeapon.ManyRuin;

public class Test <T,G>  {
private   T t;
private G g;

    public T getT() {
        return t;
    }

    public G getG() {
        return g;
    }

    public void fooTest(Weapon tip, WorkWeapon ti) {
       // tip.weapon();
        tip.fooWeapon(tip);
        ti.workWeapon();
    }

    public   void fooTest(Weapon tip){
        tip.fooWeapon();

    }

    public Test(T t, G g) {
        this.t = t;
        this.g = g;
    }

    public Test(T t) {
        this.t = t;

    }
}





