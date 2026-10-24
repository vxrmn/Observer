import java.io.File;

public class Editor {
    public EventManager eventManager;
    private File file;

    public Editor(){
        this.eventManager = new EventManager("Open", "Save");
    }

    public void openFile(String file){
        this.file = new File(file);
        this.eventManager.notify("Open", this.file);
    }

    public void saveFile() throws Exception{
        if (file != null) {
            this.eventManager.notify("Save", this.file);
        } else {
            throw new Exception("Buka File terlebih dahulu...");
        }
    }
}
