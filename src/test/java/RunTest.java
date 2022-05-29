import WebHooks.Hooks;
import org.junit.Test;

import static PageObject.baseSteps.AuthSteps.*;
import static Utils.Configuration.getConfigurationValue;
import static com.codeborne.selenide.Selenide.open;


public class RunTest extends Hooks {

    @Test
    public void Auth(){
        open(getConfigurationValue("base.url"));
        inLog(getConfigurationValue("logIn"));
        inPass(getConfigurationValue("passw"));
        authIn();
    }

}
