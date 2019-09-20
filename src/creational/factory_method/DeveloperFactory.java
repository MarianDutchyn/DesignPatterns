package creational.factory_method;

public class DeveloperFactory {

    public Developer createDeveloper(String developer){
        if(developer.equalsIgnoreCase("java")){
            return new JavaDeveloper();
        }else if(developer.equalsIgnoreCase("js")){
            return new JSDeveloper();
        }else if (developer.equalsIgnoreCase("python")){
            return new PythonDeveloper();
        }
        else {
          throw new RuntimeException(developer + " is unknown");
        }
    }
}
