package US_0501;

import Utility.BaseDriver;
import Utility.Fonksiyon;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0501 extends BaseDriver {
    @Test
    public void test_surveyResponse(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login=driver.findElement(By.cssSelector("[class='ico-login'"));
        login.click();
        Fonksiyon.bekle(2);
        WebElement emailGiris=driver.findElement(By.xpath("//input[@id='Email']"));
        emailGiris.sendKeys("123testuser456@example.com");
        WebElement passwordGiris=driver.findElement(By.xpath("//input[@id='Password']"));
        passwordGiris.sendKeys("Password1234");
        Fonksiyon.bekle(2);
        WebElement loginTikla=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        loginTikla.click();
        WebElement goodRadio=driver.findElement(By.cssSelector("input[id='pollanswers-2'] "));
        goodRadio.click();
        Fonksiyon.bekle(2);
        WebElement voteTikla=driver.findElement(By.cssSelector("input[id='vote-poll-1'] "));
        voteTikla.click();

        BekleVeKapat();
    }
}
