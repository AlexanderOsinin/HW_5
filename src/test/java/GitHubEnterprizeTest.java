import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubEnterprizeTest {

    @Test
    public void headingTest(){
        open("https://github.com/");
        $(".HeaderMenu-nav").$(byText("Solutions")).hover();
        $$("[aria-labelledby=solutions-by-company-size-heading]").first().$("a").click();
        $(".lp-SubNavContainer").shouldHave(text("Enterprise"));
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
    }
}
