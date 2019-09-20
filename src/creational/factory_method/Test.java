package creational.factory_method;

public class Test {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        Developer developer = developerFactory.createDeveloper("python");
        developer.writeCode();
    }
}
