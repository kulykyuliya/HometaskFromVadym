package Tests;

import PageObjects.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlixBusTests extends TestInit {
    @Test
    public void orderTicketFromLvivToKrarow() {
        HomePage homePage = new HomePage(driver);
        openSite("https://www.flixbus.ua/");
        fullscreen();
        homePage.firstPoint().sendKeys("Львів");
        homePage.secondPoint().sendKeys("Катовіце");
        homePage.getData().click();
        homePage.getPersonalData().click();
        sleep(2);
        homePage.getSearchBtn().click();

        Assert.assertTrue(homePage.checkTicketFromLvivToKatovice().isDisplayed());
    }

    @Test
    public void checkHeaderMenu() {
        HomePage homePage = new HomePage(driver);
        openSite("https://www.flixbus.ua/");
        fullscreen();
        homePage.getFlixBusBtn().click();
        homePage.getBtnPlanningTrip().click();
        homePage.getServiseBtn().click();
        homePage.getStatusBtn().click();
        sleep(3);
        homePage.getCertificateBtn().click();

        Assert.assertTrue(homePage.checkHeaderMenu().isDisplayed());
    }

    @Test
    public void choiceLanguage() {
        HomePage homePage = new HomePage(driver);
        openSite("https://www.flixbus.ua/");
        try {
            WebElement element = homePage.getElementByXpath("//img[@class='header-language-flag header-language-flag--white']");
            WebElement element2 = driver.findElements(By.xpath("//span[contains(text(), ' Български ')]")).get(0);

            Actions actions = new Actions(driver);
            actions.moveToElement(element).clickAndHold().moveToElement(element2).release().build().perform();

        } catch (ElementNotInteractableException e) {
            e.printStackTrace();
        }

        sleep(2);
        driver.get("https://flixbus.ch");

        Assert.assertTrue(homePage.checkUrl("ch"));
    }

    @Test
    public void checkOptionsHelpButton() {
        HomePage homePage = new HomePage(driver);
        openSite("https://www.flixbus.ua/");
        sleep(2);
        homePage.getBtnHelp().click();
        homePage.inputQuestionField().sendKeys("як оплатити картою замовлення?");
        homePage.getSecondSearchBtn().click();

        Assert.assertTrue(homePage.checkOptionsHelpBtn().isDisplayed());
    }

    @Test
    public void checkBtnFacebookMedia(){
        HomePage homePage = new HomePage(driver);
        openSite("https://www.flixbus.ua/");
        homePage.checkFaceBookBtn().click();

        Assert.assertEquals("Автобусні подорожі Європою | FlixBus", driver.getTitle());
    }

    @Test
    public void checkInstagramBtn() {
        HomePage homePage = new HomePage(driver);
        openSite("https://www.flixbus.ua/");
        homePage.checkBtnInstagram().click();

        Assert.assertEquals("Автобусні подорожі Європою | FlixBus", driver.getTitle());
    }

    @Test
    public void checkYouTubeBtn() {
        HomePage homePage = new HomePage(driver);
        openSite("https://www.flixbus.ua/");
        homePage.checkYouTubeBtn().click();

        Assert.assertEquals("Автобусні подорожі Європою | FlixBus", driver.getTitle());
    }

    @Test
    public void checkInBtn() {
        HomePage homePage = new HomePage(driver);
        openSite("https://www.flixbus.ua/");
        homePage.checkInBtn().click();

        Assert.assertEquals("Автобусні подорожі Європою | FlixBus", driver.getTitle());
    }

    @Test
    public void checkTwitterBtn() {
        HomePage homePage = new HomePage(driver);
        openSite("https://www.flixbus.ua/");
        homePage.checkTwitterBtn().click();

        Assert.assertEquals("Автобусні подорожі Європою | FlixBus", driver.getTitle());
    }

    @Test
    public void checkContactBtn() {
        HomePage homePage = new HomePage(driver);
        openSite("https://www.flixbus.ua/");
        sleep(2);
        homePage.checkContactBtn().click();

        Assert.assertTrue(homePage.checkHeaderMenu().isDisplayed());
    }
}


