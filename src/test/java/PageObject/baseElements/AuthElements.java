package PageObject.baseElements;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.eo.Se;

import static com.codeborne.selenide.Selenide.$x;

public class AuthElements {
    public static final SelenideElement inputLog = $x("//input[@id='login-form-username']");
    public static final SelenideElement inputPass = $x("//input[@id='login-form-password']");
    public static final SelenideElement inProfile = $x("//a[@id='header-details-user-fullname']");
    public static final SelenideElement viewProfile = $x("//a[@id='view_profile']");
    public static final SelenideElement getUserName = $x("//dd[@id='up-d-username']");
    public static final SelenideElement inButton = $x("//input[@value='Войти']");
    public static final SelenideElement logOut = $x("//a[@id='log_out']");

}
