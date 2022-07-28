package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getElementByXpathWithWaiter(WebDriver driver, String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(elementToBeClickable(By.xpath(locator)));
        return driver.findElement(By.xpath(locator));
    }


    public WebElement findElementByXpath(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(elementToBeClickable(By.xpath(locator)));
    }

    public List<WebElement> findElementsByXpath(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(elementToBeClickable(By.xpath(locator)));
        return driver.findElements(By.xpath(locator));
    }


    public WebElement getElementByXpath(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
        return driver.findElement(By.xpath(locator));
    }

    public WebElement firstPoint() {
        return getElementByXpath("//div[@class='smhc-input CIi7x v_c6h']/input[@placeholder='Київ']");
    }

    public WebElement secondPoint() {
        return getElementByXpath("//input[@value='Берлін']");
    }


    public WebElement getData() {
        return getElementByXpath("//input[@data-e2e='departure-date-input-field']");
    }

    public WebElement getPersonalData() {
        return getElementByXpath("//span[@data-date='2022-07-04']");
    }

    public WebElement getSearchBtn() {
        return getElementByXpath("//button[@class='smhc-btn smhc-btn--primary smhc-btn--block l_NNi']");
    }

    public WebElement checkTicketFromLvivToKatovice() {
        return getElementByXpath(" //button[contains(text(), 'EUR')]");
    }

    public WebElement getFlixBusBtn() {
        return getElementByXpath("//img[@class='flix-header-brand__img']");
    }

    public WebElement getBtnPlanningTrip() {
        return findElementsByXpath("//span[@class='flix-header-nav__link']").get(0);
    }

    public WebElement getServiseBtn() {
        return findElementsByXpath("//span[@class='flix-header-nav__link']").get(1);
    }

    public WebElement getStatusBtn() {
        return findElementsByXpath("//a[@class='flix-header-nav__link']").get(0);
    }

    public WebElement getCertificateBtn() {
        return findElementByXpath("//span[contains(text(), 'Довідка')]");
    }

    public WebElement checkHeaderMenu() {
        return findElementByXpath("//h2[contains(text(), 'Чим ми можемо вам допомогти?')]");
    }

    public WebElement getBtnHelp() {
        return findElementsByXpath("//span[@class='service-menu-text']").get(2);
    }

    public WebElement inputQuestionField() {
        return findElementByXpath("//input[@class='search-input search-input--right']");
    }

    public WebElement getSecondSearchBtn() {
        return findElementByXpath("//button[@title='Пошук'][contains(@class, 'inputSearchButton')]");
    }

    public WebElement checkOptionsHelpBtn() {
        return findElementByXpath("//a[@title='Як я можу <mark>оплатити</mark> заброньований квиток?']");
    }

    public boolean checkUrl(String Url) {
        return driver.getCurrentUrl().contains(Url);
    }

    public WebElement checkFaceBookBtn() {
        return findElementByXpath("//img[@alt='footer facebook link']");
    }

    public WebElement checkBtnInstagram() {
        return findElementByXpath("//img[@alt='footer instagram link']");
    }

    public WebElement checkYouTubeBtn() {
        return findElementByXpath("//img[@alt='footer youtube link']");
    }

    public WebElement checkInBtn() {
        return findElementByXpath("//img[@alt='footer linkedin link']");
    }

    public WebElement checkTwitterBtn() {
        return findElementByXpath("//img[@alt='footer twitter link']");
    }

    public WebElement checkContactBtn() {
        return findElementsByXpath("//a[@href='https://help.flixbus.com/s/?language=UK']").get(1);
    }
}
