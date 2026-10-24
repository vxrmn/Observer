import java.io.File;

public class EmailAlertsListener implements EventListener{
    private String email;

    public EmailAlertsListener(String email){
        this.email = email;
    }

    @Override     
    public void update(String eventType, File file){
        System.out.println("Email Kepada" + this.email 
        + ". Seseorang telah melakukan operasi " + eventType 
        + "untuk file bernama : " + file.getName());
    }
}
