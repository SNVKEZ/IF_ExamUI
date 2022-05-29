package PageObject.baseSteps;

import io.qameta.allure.Step;
import org.junit.Assert;

import static PageObject.baseElements.FindProjectElem.*;
import static WebHooks.Hooks.saveAsScreenshot;

public class FindProject {

    @Step("ищем проект")
    public static void findProjectTest(){
        openProjects.click();
        openTestProject.click();
        saveAsScreenshot();

    }
    @Step("сверяем название проекта")
    public static void openProject(String nameProject){

        Assert.assertEquals("выбран не тот проект",chckNameProject.getText(),nameProject);
        saveAsScreenshot();
    }

}
