package weapon;

public class Ak47 extends Rifle{
    @Override
    public void weapon() {
        ak47();
        super.weapon();
    }

    private void ak47(){
        System.out.println("Ak47");
    }
}
