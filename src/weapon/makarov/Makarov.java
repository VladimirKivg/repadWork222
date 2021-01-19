package weapon;

public class Makarov extends Rifle implements WorkWeapon{
    @Override
    public void weapon() {
        makarov();
        super.weapon();

    }
    private void makarov(){

        System.out.println("пістолет Макаров");
    }
    @Override
    public void workWeapon() {

        System.out.println("це пістоле, не автомат звичайно," +
                " але краще ніж нічого");
    }


}
