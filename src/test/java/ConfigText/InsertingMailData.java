package ConfigText;


import org.aeonbits.owner.Config;

@Config.Sources("classpath:Mail.properties")
public interface InsertingMailData extends Config{
    String login();
    String password();
    String recipient();
    String topic();
    String message();
    String github();
    String meta();
}
