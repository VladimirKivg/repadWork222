package weapon.weaponCut;

import weapon.typeWeapon.Cut;
//добавить и сюда и в остальные колющие интерфейс
public class Dirk extends Cut {
    @Override
    public void weapon() {
        super.weapon();
        System.out.println("нею кидають (митают) для нанесення ран на відстані");
    }
}
