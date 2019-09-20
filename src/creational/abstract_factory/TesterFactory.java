package creational.abstract_factory;

public class TesterFactory implements Factory<Tester>{
    @Override
    public Tester create(String tester){
        if (tester.equalsIgnoreCase("Manual")){
            return new ManualTester();
        } else if(tester.equalsIgnoreCase("Automation")){
            return new AutomationTester();
        } else {
            throw new RuntimeException(tester + " is unknown");
        }
    }

}
