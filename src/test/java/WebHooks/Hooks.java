package WebHooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;

public class Hooks {

    @BeforeEach
    public void setupAllure(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    @Attachment(value = "screen",type = "image/png")
    public static byte[] saveAsScreenshot() {
        return Selenide.screenshot(OutputType.BYTES);

    }

    @Before
    public void setWebDriverFormat() {
        String webDriverLocation = Utils.Configuration.getConfigurationValue("webDriverLocationLocal");
        if(Utils.Configuration.getConfigurationValue("remote.url")!=null){
            Configuration.remote=Utils.Configuration.getConfigurationValue("remote.url");
        }
        if(webDriverLocation!=null){
            System.setProperty("webdrider.chrome.driver",webDriverLocation);
            System.setProperty("selenide.browser","Chrome");

        }

        Configuration.startMaximized = true;
    }

    @After
    public void closeDriver(){
        WebDriverRunner.closeWebDriver();
    }
}
