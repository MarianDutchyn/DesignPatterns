package creational.singelton;

public class ProgramLogger {

    private static ProgramLogger programLogger;
    private static String logFile = "This is log file. \n\n";

    private ProgramLogger(){}

    public static ProgramLogger getProgramLogger(){
        if (programLogger == null){
            return new ProgramLogger();
        }else {
            return programLogger;
        }
    }

    public void addLog(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLog(){
        System.out.println(logFile);
    }
}
