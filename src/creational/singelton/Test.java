package creational.singelton;

public class Test {
    public static void main(String[] args) {
        ProgramLogger  programLogger = ProgramLogger.getProgramLogger();
        programLogger.addLog("First Log");
        programLogger.addLog("Second Log");
        programLogger.addLog("Third Log");

        programLogger.showLog();

    }
}
