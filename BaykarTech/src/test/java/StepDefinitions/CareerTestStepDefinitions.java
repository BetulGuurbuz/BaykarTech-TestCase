package StepDefinitions;

import Pages.CareerTestPage;
import util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CareerTestStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    CareerTestPage careerTestPage = new CareerTestPage(driver);

    @Given("Ziyaretci Baykartech kariyer sayfasindadir")
    public void ziyaretciBaykartechKariyerSayfasindadir() {
        careerTestPage.careerHomePage();
    }

    @Given("Acik pozisyonlar linkine tiklar")
    public void acikPozisyonlarLinkineTiklar() {
        careerTestPage.openPositions();
    }

    @Given("Tum acik pozisyonlar linkine tiklar")
    public void tumAcikPozisyonlarLinkineTiklar() {
        careerTestPage.allOpenPositions();
    }

    @When("Birimlerden uretim yonetimini secer")
    public void birimlerdenUretimYonetiminiSecer() {
        careerTestPage.unitsProductionManagement();
    }
    @When("Arama alanina ana veri yazar")
    public void aramaAlaninaAnaVeriYazar() {
        careerTestPage.searchData();
    }

    @Then("Ana veri personeli ilanina tiklar")
    public void anaVeriPersoneliIlaninaTiklar() {
        careerTestPage.jobsDataManagement();
    }
}