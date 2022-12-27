import ConfigText.InsertingMailData;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Owner;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Owner("c@tcat4er")

@DisplayName("Try to send the message")
public class MailSendingTest {

    void test1() {
        assertTrue(true);
    }


//
//    String baseUrl = ("https://mail.ru/");
//    InsertingMailData insText = ConfigFactory.create(InsertingMailData.class);
//
//    @Test
//    public void MailSendingTestWithSteps() {
//
//        Configuration.browserSize = "1920x1080";
//
//        String login = insText.login();
//        String password = insText.password();
//        String message = insText.message();
//        String recipient = insText.recipient();
//        String topic = insText.topic();
//        String github = insText.github();
//        String meta = insText.meta();
//
//        step("open mail.ru", () -> open(baseUrl));
//
//        step("authorisation", () -> {
//            $("[data-testid=enter-mail-primary]").click();
//            Selenide.switchTo().frame($(".ag-popup__frame__layout__iframe"));
//            $("[name=username]").setValue(login);
//            $("[data-test-id=next-button]").click();
//            $("[name=password]").setValue(password);
//            $("[data-test-id=submit-button]").click();
//
//        });
//
//        sleep(3000); //знаю что слип это пошло, но сайт не реагирует на другие асерты.
//
//        step("closing popups if there is", () -> {
//            if($(".ph-project-promo-close-icon").exists()) {
//                $(".ph-project-promo-close-icon").click();
//            }
//            if($("[data-test-id='onboarding-button-start']").exists()){
//                $("[data-test-id='onboarding-button-start']").click();
//                $("[data-test-id='cross'] .base-0-2-1").click();
//            }
//        });
//
//        step("check successful authorisation", () -> {
//            $(".compose-button__wrapper .compose-button__txt").shouldHave(text("Написать письмо"));
//        });
//
//        step("writing letter", () -> {
//            $(".compose-button__wrapper").click();
//            $(".head_container--3W05z .container--H9L5q").setValue(recipient);
//            $(".subject__container--HWnat .container--H9L5q").setValue(topic);
//            $("[role='textbox']").toWebElement().sendKeys(message + meta);
//        });
//
//        step("insert some links",() -> {
//            $("[title = 'Вставить ссылку']").click();
//            $("[data-test-id = link]").setValue(github);
//            $("[data-test-id = text]").setValue("Ссылка на работу в Гитхабе");
//            $("[data-test-id=save] .vkuiButton__in").click();
//            $(".vkuiButton__in").click();
//        });
//
//        step("check successful mail sending",() -> {
//            $(".layer__link").shouldHave(text("Письмо отправлено"));
//        });
//
//
//
//    }


}
