package ConfigText;


import org.aeonbits.owner.Config;

@Config.Sources("classpath:Text.properties")
public interface InsertingText extends Config{
    String login();
    String password();
    String recipient();
    String topic();
    String message();
    String github();
    String meta();
}
