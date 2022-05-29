package PageObject.baseSteps;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static PageObject.baseElements.CreateBugElem.*;
import static PageObject.baseSteps.FindProject.*;
import static WebHooks.Hooks.saveAsScreenshot;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CreateBug {
    public static String deleteString = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE;
    public static String nameTheme = "Ошибка для дз №3";
    public static String typeBug = "Ошибка";

    @Step("нажимаем создать задачу")
    public static void clickCreate(){
        createTaskLink.click();
        saveAsScreenshot();
    }

    @Step("меняем тип задачи")
    public static void changeType(){
        changeTypeTask.shouldBe(visible, Duration.ofSeconds(60)).click();
        changeTypeTask.sendKeys(deleteString);
        changeTypeTask.setValue(typeBug);
        saveAsScreenshot();
    }

    @Step("меняем название задачи")
    public static void inThem(){
        inputTheme.shouldBe(visible, Duration.ofSeconds(60)).click();
        inputTheme.setValue(nameTheme);
        saveAsScreenshot();
    }

    @Step("пишем описание")
    public static void inDescr(){
        Selenide.switchTo().frame("mce_7_ifr");
        $x("//body[@id='tinymce']/p").sendKeys("както так");
        Selenide.switchTo().defaultContent();
        saveAsScreenshot();
    }

    @Step("пишем окружение")
    public static void inDescr1(){
        Selenide.switchTo().frame("mce_8_ifr");
        $x("//body[@id='tinymce']/p").sendKeys("както так");
        Selenide.switchTo().defaultContent();
        saveAsScreenshot();
    }

    @Step("меняем версию")
    public static void editVers(){
        fixVersion.click();
        saveAsScreenshot();

    }
    @Step("меняем затронутую версию")
    public static void editVers1(){
        versions.click();
        saveAsScreenshot();

    }
    @Step("назначаем себя исполнителем")
    public static void assignMe(){
        assigMe.click();
        saveAsScreenshot();
    }
    @Step("нажимаем создать")
    public static void createBug(){
        createTask.click();
        closeSpamWindow.shouldBe(visible,Duration.ofSeconds(60)).click();
        saveAsScreenshot();

    }
    @Step("ищем свою задачу")
    public static void findMyBug(){
        findProjectTest();
        fullTasks.click();
        saveAsScreenshot();
    }
    @Step("проверяем нашу задачу")
    public static void chckMyBug(){
        findTestSelenium.shouldBe(visible, Duration.ofSeconds(60)).click();
        findTestSelenium.setValue(nameTheme);
        findButt.shouldBe(visible, Duration.ofSeconds(60)).click();
        saveAsScreenshot();
        goToTestSelenium.click();
        Assert.assertEquals(nameTest.getText(), nameTheme);
    }
    @Step("проверяем статус нашей задачи")
    public static void checkStatusMyBug(){
        boolean flag = false;

        while(!flag){
            switch (result.getText().toLowerCase()){
                case "сделать":
                    inWork.click();
                    closeSpamWindow.shouldBe(visible,Duration.ofSeconds(60)).click();
                    saveAsScreenshot();
                    break;
                case "в работе":
                    buisnessProcess.shouldBe(visible,Duration.ofSeconds(60)).click();
                    clickGoodRes.shouldBe(visible,Duration.ofSeconds(60)).click();
                    closeSpamWindow.shouldBe(visible,Duration.ofSeconds(60)).click();
                    saveAsScreenshot();
                    break;
                case "готово":
                    flag=true;
                    saveAsScreenshot();
            }
        }
    }
}
