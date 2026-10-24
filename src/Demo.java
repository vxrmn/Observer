public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.eventManager.subscribe("Open", new LoggingListener("D::\\mencoba.txt"));
        editor.eventManager.subscribe("Save", new EmailAlertsListener("paijo@gmail.com"));

        try {
            editor.openFile("text.txt");
            editor.saveFile();
        } catch (Exception e) {
            
        }
    }
}
