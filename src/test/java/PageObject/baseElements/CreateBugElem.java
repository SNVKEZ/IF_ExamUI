package PageObject.baseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CreateBugElem extends CheckTaskSeleniumElem{
    public static SelenideElement createTaskLink = $x("//a[@id='create_link']");
    public static SelenideElement changeTypeTask = $x("//input[@id='issuetype-field']");
    public static final SelenideElement inputTheme = $x("//input[@class='text long-field']");
    public static final SelenideElement createTask =$x("//input[@value='Создать']");
    public static final SelenideElement inWork = $x("//a[@id='action_id_21']");
    public static final SelenideElement assigMe = $x("//button[@data-field-id='#assignee']");
    public static final SelenideElement buisnessProcess = $x("//span[contains(text(),'Бизнес-процесс')]");
    public static final SelenideElement closeSpamWindow = $x("//button[@class='aui-close-button']");
    public static final SelenideElement clickGoodRes = $x("//span[contains(text(),'Выполнено')]");
    public static final SelenideElement result = $x("//span[@id='status-val']");
    public static final SelenideElement fixVersion = $x("//select[@id='fixVersions']//option[@value='10001']");
    public static final SelenideElement versions = $x("//select[@id='versions']//option[@value='10001']");

}
