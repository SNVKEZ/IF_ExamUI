package PageObject.baseSteps;

import io.qameta.allure.Step;
import org.junit.Assert;

import java.time.Duration;

import static PageObject.baseElements.AuthElements.*;
import static WebHooks.Hooks.saveAsScreenshot;
import static com.codeborne.selenide.Condition.visible;

public class AuthSteps {



    @Step("записываем логин")
    public static void inLog(String log){
        inputLog.shouldBe(visible, Duration.ofSeconds(60)).click();
        inputLog.setValue(log);
        saveAsScreenshot();
    }
    @Step("записываем пароль")
    public static void inPass(String pass){
        inputPass.shouldBe(visible, Duration.ofSeconds(60)).click();
        inputPass.setValue(pass);
        saveAsScreenshot();
    }
    @Step("выполняем вход")
    public static void authIn(){
        inButton.click();
        saveAsScreenshot();
    }
    @Step("проверяем логин")
    public static void chckLog(String nick){
        inProfile.click();
        viewProfile.click();
        //проверяем совпадение логина
        Assert.assertEquals("Вход пользователя не был осуществлен!",getUserName.getText(),nick);
        saveAsScreenshot();
    }

    @Step("Выходим из профиля, чтобы можно было протестировать одновременно все тесты")
    public static void outLog(){
        inProfile.click();
        logOut.click();
    }
}
