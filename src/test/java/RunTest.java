import WebHooks.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static PageObject.baseSteps.AuthSteps.*;
import static PageObject.baseSteps.CheckNumbTasksStep.checkTask;
import static PageObject.baseSteps.CheckTaskSelenium.*;
import static PageObject.baseSteps.CreateBug.*;
import static PageObject.baseSteps.FindProject.*;
import static Utils.Configuration.getConfigurationValue;
import static com.codeborne.selenide.Selenide.*;


public class RunTest extends Hooks {


    @DisplayName("Авторизация")
    @Tag("1")
    @Test
    public void Auth(){
        open(getConfigurationValue("base.url"));
        inLog(getConfigurationValue("logIn"));
        inPass(getConfigurationValue("passw"));
        authIn();
        chckLog(getConfigurationValue("logIn"));
        outLog();
    }

    @DisplayName("Поиск проекта и проверка количества задач в проекте")
    @Tag("2")
    @Test
    public void findProj(){
        open(getConfigurationValue("base.url"));
        inLog(getConfigurationValue("logIn"));
        inPass(getConfigurationValue("passw"));
        authIn();
        chckLog(getConfigurationValue("logIn"));
        findProjectTest();
        openProject(getConfigurationValue("nameProject"));
        checkTask();
        outLog();
    }

    @DisplayName("Поиск TestSelenium")
    @Tag("3")
    @Test
    public void findTestSelenium(){
        open(getConfigurationValue("base.url"));
        inLog(getConfigurationValue("logIn"));
        inPass(getConfigurationValue("passw"));
        authIn();
        chckLog(getConfigurationValue("logIn"));
        findProjectTest();
        openProject(getConfigurationValue("nameProject"));
        checkTask();
        openTasks();
        findTestSelen(getConfigurationValue("nameTestSelenium"));
        inTest();
        chckName(getConfigurationValue("nameTestSelenium"));
        chckStat("в работе");
        chckVers("version 2.0");
        outLog();
    }

    @DisplayName("Создание своего бага")
    @Tag("4")
    @Test
    public void createMyBug(){
        open(getConfigurationValue("base.url"));
        inLog(getConfigurationValue("logIn"));
        inPass(getConfigurationValue("passw"));
        authIn();
        chckLog(getConfigurationValue("logIn"));
        findProjectTest();
        openProject(getConfigurationValue("nameProject"));
        checkTask();
        openTasks();
        findTestSelen(getConfigurationValue("nameTestSelenium"));
        inTest();
        chckName(getConfigurationValue("nameTestSelenium"));
        chckStat("в работе");
        chckVers("version 2.0");
        clickCreate();
        changeType();
        inThem();
        inDescr();
        inDescr1();
        editVers();
        editVers1();
        assignMe();
        createBug();
        findMyBug();
        chckMyBug();
        checkStatusMyBug();
        outLog();
    }
}
