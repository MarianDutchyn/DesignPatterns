package structual.bridge;

public class Test {
    public static void main(String[] args) {
        Program bank = new BankSystem(new JavaDeveloper());
        Program shop = new ShopSystem(new RubyDeveloper());
        bank.developProgram();
        shop.developProgram();
    }
}
