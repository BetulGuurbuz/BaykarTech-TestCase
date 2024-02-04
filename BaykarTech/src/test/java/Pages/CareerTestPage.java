package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.assertEquals;

public class CareerTestPage {
    WebDriver driver;
    util.ElementHelper elementHelper;
    WebDriverWait wait;
    By openPositions = By.cssSelector("[href='/tr/#services']");
    By allOpenPositions = By.cssSelector(".btn[href='/tr/basvuru/acik-pozisyonlar/']");
    By checkboxProductionManagement = By.xpath("//input[@value='Üretim Yönetimi']");
    By textboxSearchJob = By.id("myInput");
    By jobDataManagement = By.cssSelector("[href='/tr/basvuru/acik-pozisyonlar/ana-veri-personeli']");
    By textJobControl = By.xpath("//li[.='Teknik resim okuma becerisine sahip,']");
    
    public CareerTestPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new util.ElementHelper(driver);
    }

    public void careerHomePage() {
        driver.get("https://kariyer.baykartech.com/tr/");
    }

    public void openPositions() {
        driver.findElement(openPositions).click();
    }

    public void allOpenPositions() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,650)", " ");
        driver.findElement(allOpenPositions).click();
    }

    public void unitsProductionManagement() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,300)", " ");
        driver.findElement(checkboxProductionManagement).click();
        }

    public void searchData() {
        driver.findElement(textboxSearchJob).sendKeys("Ana Veri");
    }

    public void jobsDataManagement() {
        driver.findElement(jobDataManagement).click();
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,150)", " ");
        WebElement jobControl = driver.findElement(textJobControl);
        String textJobControl = jobControl.getText();
        assertEquals(textJobControl, "Teknik resim okuma becerisine sahip,");
    }
}