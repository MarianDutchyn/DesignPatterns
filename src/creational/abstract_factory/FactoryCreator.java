package creational.abstract_factory;

public class FactoryCreator {
    public Factory getFactory(String factory){
        if (factory.equalsIgnoreCase("developer")){
            return new DeveloperFactory();
        }else if(factory.equalsIgnoreCase("tester")){
            return new TesterFactory();
        }else {
            throw new RuntimeException(factory + " is unknown");
        }
    }
}
