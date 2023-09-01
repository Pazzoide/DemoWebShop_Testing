package US_0201;

import US_0301.TC_0301;
import Utility.BaseDriver;
import Utility.Fonksiyon;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_0201 extends BaseDriver {
    @Test
    public void test_logoutFunctionality() {

        driver.get("https://demowebshop.tricentis.com/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(linkTextLctr));

        WebElement loginLink = driver.findElement(loginLctr);
        loginLink.click();

        WebElement email = driver.findElement(emailLcrtr);
        email.sendKeys("123testuser456@example.com");

        WebElement password = driver.findElement(passwordLctr);
        password.sendKeys("Password1234");

        WebElement loginTikla = driver.findElement(loginBtnLctr);
        loginTikla.click();

        Fonksiyon.bekle(2);

        wait.until(ExpectedConditions.visibilityOfElementLocated(linkTextLctr2));
        WebElement logOutButton = driver.findElement(logOutLctr);
        logOutButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(linkTextLctr));

        WebElement registerIsDisplayed = driver.findElement(By.cssSelector("[class='ico-register']"));
        Assert.assertTrue("Çıkış işlemi başarısız oldu",registerIsDisplayed.isDisplayed());

    }

    By linkTextLctr2 = By.linkText("Log out");
    By logOutLctr = By.cssSelector("[class='ico-logout']");
    By linkTextLctr = By.linkText("Log in");
    By loginLctr = By.cssSelector("[class='ico-login']");
    By emailLcrtr = By.xpath("//input[@id='Email']");
    By passwordLctr = By.xpath("//input[@id='Password']");
    By loginBtnLctr = By.cssSelector("input[class='button-1 login-button']");
}
