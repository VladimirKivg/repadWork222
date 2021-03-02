package repadWork_interf.flyHelicopter;

import repadWork_interf.tupFly.Helicopter2;

public class Albatros extends Helicopter2 {
    public void flay() {// і тут створити цей клас як обєкт, і взагалі всі кінцеві класі мають бути обєктами
             fly();
        verticalTakeoff();
    }

    @Override
    public void fly() {
        System.out.println("Albatros роботящая лошадка ");
    }

    @Override
    public void verticalTakeoff() {
        System.out.println(" вертикальный взлет");
    }
}
