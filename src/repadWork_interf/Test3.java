package repadWork_interf;

import repadWork_interf.flyHelicopter.Mi82;

public class Test3 {


    public static void main(String[] args) {
        Mi82 mi82 = new Mi82();
        FlingObject2 flingObject2 = new Mi82();

        flingObject2.setSurname("");
        //удалить это аж до создания FlingObject2
        mi82.flyWeapon();


    }


}
