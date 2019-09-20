package creational.abstract_factory;

public class DeveloperFactory implements Factory<Developer> {
    @Override
    public Developer create(String developer){
        if(developer.equalsIgnoreCase("java")){
            return new JavaDeveloper();
        }else if(developer.equalsIgnoreCase("js")){
            return new JSDeveloper();
        }
        else {
            throw new RuntimeException(developer + " is unknown");
        }
    }

}
