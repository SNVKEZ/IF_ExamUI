package PageObject.baseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CheckNumbTaskElem {
    public static final SelenideElement countTask = $x("//div[@class='showing']");
}
