package PageObject.baseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CheckTaskSeleniumElem {
    public static final SelenideElement fullTasks = $x("//div[@id='full-issue-navigator']");
    public static final SelenideElement findTestSelenium = $x("//input[@aria-label='Содержит текст']");
    public static final SelenideElement findButt = $x("//button[@original-title='Поиск задач']");
    public static final SelenideElement goToTestSelenium = $x("//a[@class='issue-link']");
    public static final SelenideElement nameTest = $x("//h1[@class='editable-field inactive']");
    public static final SelenideElement statusTest = $x("//span[@id='status-val']");
    public static final SelenideElement versTest = $x("//span[@id='versions-val']");
}
