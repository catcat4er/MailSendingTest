package ConfigText;


import org.aeonbits.owner.Config;

@Config.Sources("classpath:Text.properties")
public interface InsertingText extends Config{
    String login();
    String password();
    String message();

}
