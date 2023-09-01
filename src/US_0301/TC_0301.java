package US_0301;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_0301 extends BaseDriver {

    @Test
    public void test_userLoginFunctionality(){

        driver.get("https://demowebshop.tricentis.com/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(linkTextLctr));

        WebElement loginLink= driver.findElement(loginLctr);
        loginLink.click();

        WebElement email=driver.findElement(emailLcrtr);
        email.sendKeys("123testuser456@example.com");

        WebElement password=driver.findElement(passwordLctr);
        password.sendKeys("Password1234");

        WebElement loginTikla=driver.findElement(loginBtnLctr);
        loginTikla.click();

        WebElement accountCntrl = driver.findElement(By.xpath("//a[@class='account'][text()='123testuser456@example.com']"));

        Assert.assertTrue("Doğrulama başarısız oldu",accountCntrl.getText().contains("123testuser456@example.com"));

    }
    By linkTextLctr = By.linkText("Log in");
    By loginLctr = By.cssSelector("[class='ico-login']");
    By emailLcrtr = By.xpath("//input[@id='Email']");
    By passwordLctr = By.xpath("//input[@id='Password']");
    By loginBtnLctr = By.cssSelector("input[class='button-1 login-button']");
}
