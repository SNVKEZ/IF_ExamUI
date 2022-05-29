package PageObject.baseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FindProjectElem {
    public static final SelenideElement openProjects = $x("//a[@title='Просмотр недавних проектов или списка всех проектов']");
    public static final SelenideElement openTestProject = $x("//a[@id='admin_main_proj_link_lnk']");
    public static final SelenideElement chckNameProject = $x("//a[@id='project-name-val']");
}
