import ConfigText.InsertingText;
import io.qameta.allure.Owner;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

@Owner("c@tcat4er")
@DisplayName("Try to send the message")
public class MailSendingTest {

    InsertingText insText = ConfigFactory.create(InsertingText.class);



    @Test
    public void MailSendingTestWithSteps() {

        String login = insText.login();
        String password = insText.password();
        String message = insText.message();

        step("open mail.ru", () -> {
            open("https://account.mail.ru/");
        });

        step("authorisation", () -> {

            $("[name=username]").setValue(login);
            $("[data-test-id=next-button]").click();
            $("[name=password]").setValue(password);
            $("[data-test-id=submit-button]").click();
            sleep(3000);
            $(".compose-button__wrapper").click();
            $(".head_container--3W05z .container--H9L5q").setValue("1111");
            $(".subject__container--HWnat .container--H9L5q").setValue("1111");
            $("[role='textbox']").setValue(message);
            $(".vkuiButton__in").click();
            $("#dimmer").shouldBe(visible);
            $("[]");
//
        });

    }
}
