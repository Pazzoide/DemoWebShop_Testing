package US_0601_Burcu;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_0601 extends BaseDriver {
    @Test
    public void SiparisGecmisiniBilgisayaraIndirme_Test()
    {
        driver.get("https://demowebshop.tricentis.com/"); // Test ortamında web tarayıcısını başlattım.

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in")));

        WebElement loginButton= driver.findElement(By.cssSelector("[class='ico-login']"));
        loginButton.click(); // "Login" butonuna tıkladım.

        WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("123testuser456@example.com");

        WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Password1234");

        WebElement loginTikla=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        loginTikla.click(); // login tıklayıp Hesabım Sayfasına girdim.

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("Orders")));

        WebElement ordersTikla=driver.findElement(By.xpath("//a[text()='Orders']"));
        ordersTikla.click(); // "Orders" adlı bağlantıya tıkladım.











        BekleVeKapat();


    }
}
