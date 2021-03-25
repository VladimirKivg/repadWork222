package repadWork_interf.flyAircraft;

import repadWork_interf.tupFly.Aircraft2;

public class Boeing749 extends Aircraft2 {//так само тут створити як обєкт

    public void flyWor() {
        fly();
        gorizontTakeoff();
    }

    @Override
    public void fly() {
        System.out.println("я лечу 749");
    }

    @Override
    public void gorizontTakeoff() {
        System.out.println("горизонтальный взлет");
    }
}
