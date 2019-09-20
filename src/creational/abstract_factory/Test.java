package creational.abstract_factory;

public class Test {
    public static void main(String[] args) {
            FactoryCreator factoryCreator = new FactoryCreator();

            Factory<Developer> developerFactory = factoryCreator.getFactory("developer");
            Developer javaDeveloper = developerFactory.create("java");
            javaDeveloper.writeCode();

            Factory<Tester> testerFactory = factoryCreator.getFactory("Tester");
            Tester manualTestre = testerFactory.create("manual");
            manualTestre.testCode();
    }
}
