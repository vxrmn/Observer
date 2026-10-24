import java.io.File;

public class LoggingListener implements EventListener {
    private File log;

    public LoggingListener(String filename){
        this.log = new File(filename);
    }

    @Override 
    public void update(String eventType, File file){
        System.out.println("Log disimpan di : " + this.log 
        + ". Seseorang telah melakukan operasi " + eventType 
        + "untuk file bernama : " + file.getName());
    }
}
