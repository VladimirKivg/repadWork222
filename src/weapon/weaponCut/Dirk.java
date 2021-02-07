package weapon.weaponCut;

import weapon.WorkWeapon;
import weapon.typeWeapon.Cut;

import javax.sql.rowset.WebRowSet;

//добавить и сюда и в остальные колющие интерфейс
public class Dirk extends Cut implements WorkWeapon {
    @Override
    public void weapon() {
        super.weapon();
        System.out.println("нею кидають (митают) для нанесення ран на відстані");
        workWeapon();
    }

    @Override
    public void workWeapon() {
        System.out.println("використовує спецназ азіатских країн, " +
                "схоже на зброю нінзя");
    }
}
