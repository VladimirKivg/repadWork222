package repadWork_interf.tupFly;

import repadWork_interf.FlingObject2;
import repadWork_interf.VerticalTakeoff2;

public abstract class   Helicopter2 extends FlingObject2 implements VerticalTakeoff2 {//и этот тагже повторно сделаем абстрактным
//Helicopter уже наследуеться от одного класса, а в java множественное наследование запрещено
    /* для ветрикального взлета мы создадим интерфейс так как вертикально может взлетать не только
     * вертолет но и допустим ракета */

    public void verticalTakeoff2(){
        System.out.println("Взлетаем на любой площадке ");

    };
}
