package repadWork_interf.tupFly;

import repadWork_interf.FlingObject2;
import repadWork_interf.GorizontTakeoff;

public abstract class Aircraft2 extends FlingObject2 implements GorizontTakeoff {
    @Override
    public void fly() {
        System.out.println("я лечу ");
    }

    @Override
    public void gorizontTakeoff() {
        System.out.println("горизонтальный взлет");

    }

    //делаем этот класс тоже абстрактным
    public void max(){
        System.out.println("можно взлетать с разными грузами");

    }
}
