package repadWork_interf.flyAircraft;

import repadWork_interf.tupFly.Aircraft2;

public class Tu124 extends Aircraft2 {
    public void fluWork(){// спробувати в подальшому створити цей клас як обєк з параметрами і т.д

    }
    @Override
    public void fly() {
        System.out.println("маленький блин но очень проворный Tu124");
    }

    @Override
    public void gorizontTakeoff() {
        System.out.println("горизонтальный взлет");
    }
}
