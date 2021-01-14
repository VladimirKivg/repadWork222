package weapon;

public class Ak47 extends Rifle implements WorkWeapon{
    @Override
    public void weapon() {
        ak47();
        super.weapon();
    }

    private void ak47(){

        System.out.println("Ak47");
    }

    @Override
    public void workWeapon() {
        System.out.println("це автомат, але дуже зручний");
    }
}
