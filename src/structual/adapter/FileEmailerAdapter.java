package structual.adapter;

public class FileEmailerAdapter extends FileComitter {

    FileEmailer fileEmailer;

    public FileEmailerAdapter(FileEmailer fileEmailer) {
        this.fileEmailer = fileEmailer;
    }

    @Override
    public void saveFile() {
        fileEmailer.sendFile();
    }
}
