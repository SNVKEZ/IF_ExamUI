package PageObject.baseSteps;

import io.qameta.allure.Step;
import org.junit.Assert;

import java.time.Duration;

import static PageObject.baseElements.CheckTaskSeleniumElem.*;
import static WebHooks.Hooks.saveAsScreenshot;
import static com.codeborne.selenide.Condition.visible;

public class CheckTaskSelenium {

    @Step("открываем список задач")
    public static void openTasks(){
        fullTasks.click();
        saveAsScreenshot();
    }
    @Step("ищем тест селениум")
    public static void findTestSelen(String nameTestValue){
        findTestSelenium.shouldBe(visible, Duration.ofSeconds(60)).click();
        findTestSelenium.setValue(nameTestValue);
        saveAsScreenshot();
        findButt.click();
    }
    @Step("открываем тест селениум")
    public static void inTest(){
        goToTestSelenium.click();
        saveAsScreenshot();
    }
    @Step("проверяем название теста")
    public static void chckName(String nameTestValue){
        Assert.assertEquals(nameTest.getText(),nameTestValue);
        saveAsScreenshot();
    }
    @Step("проверяем статус задачи")
    public static void chckStat(String statusTestValue){
        Assert.assertEquals("Статус задачи не верен",
                statusTest.getText().toLowerCase(),statusTestValue);
        saveAsScreenshot();
    }
    @Step("проверяем версию")
    public static void chckVers(String versionTestValue){
        Assert.assertEquals("Неправильная привязка версии",
                versTest.getText().toLowerCase(), versionTestValue);
        saveAsScreenshot();
    }
}
