package StepDefinitions;
import Pages.LanguageTestPage;
import util.DriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class LanguageTestStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    LanguageTestPage languageTestPage = new LanguageTestPage(driver);

    @Then("ingilizce web sayfasina gecis yapar")
    public void ingilizceWebSayfasinaGecisYapar() {
        languageTestPage.englishHomePage();
    }

    @Then("Turkce web sayfasina gecis yapar")
    public void turkceWebSayfasinaGecisYapar() {
        languageTestPage.turkishHomePage();
    }
}