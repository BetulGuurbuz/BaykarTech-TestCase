package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.assertEquals;

public class LanguageTestPage {
    WebDriver driver;
    util.ElementHelper elementHelper;
    WebDriverWait wait;
    By enControl = By.cssSelector(".nav-item[href='/en/contact/']");
    By trControl = By.cssSelector("a[href='/tr/iletisim/']");

    public LanguageTestPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new util.ElementHelper(driver);
    }

    public void englishHomePage() {
        driver.get("https://baykartech.com/en/");
        WebElement englishControl = driver.findElement(enControl);
        String enControlText = englishControl.getText();
        assertEquals(enControlText, "CONTACT");
    }

    public void turkishHomePage() {
        driver.get("https://baykartech.com/tr/");
        WebElement turkishControl = driver.findElement(trControl);
        String trControlText = turkishControl.getText();
        assertEquals(trControlText, "İLETİŞİM");
    }
}