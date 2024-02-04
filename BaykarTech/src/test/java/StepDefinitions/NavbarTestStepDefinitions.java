package StepDefinitions;
import Pages.NavbarTestPage;
import util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class NavbarTestStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    NavbarTestPage navbarTestPage = new NavbarTestPage(driver);
    @Given("Ziyaretci anasayfadadir")
    public void ziyaretciAnasayfadadir() {
        navbarTestPage.homePage();
    }

    @Given("Popup kapatilir")
    public void popupKapatilir() {
        navbarTestPage.closePopup();
    }

    @Then("Navbar elementlerine tiklanir")
    public void navbarElementlerineTiklanir()  {
        navbarTestPage.navbarElements();
    }
}