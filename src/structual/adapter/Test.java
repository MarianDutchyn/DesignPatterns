package structual.adapter;

public class Test {
    public static void main(String[] args) {
        FileComitter fileComitter = new FileEmailerAdapter(new FileEmailer());
        fileComitter.saveFile();
    }
}
