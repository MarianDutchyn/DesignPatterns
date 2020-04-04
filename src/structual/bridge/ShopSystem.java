package structual.bridge;

public class ShopSystem extends Program {


    public ShopSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Shop System development in progress");
        developer.writeCode();
    }
}
