package US_0601;

import Utility.BaseDriver;
import Utility.Fonksiyon;
import com.sun.deploy.cache.Cache;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;

public class TC_0601 extends BaseDriver {
    @Test
    public void test_downloadOrderHistory()throws Exception {
        driver.get("https://demowebshop.tricentis.com/"); // Test ortamında web tarayıcısını başlattım.

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in")));

        WebElement loginButton = driver.findElement(By.cssSelector("[class='ico-login']"));
        loginButton.click(); // "Login" butonuna tıkladım.

        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("123testuser456@example.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Password1234");

        WebElement loginTikla = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        loginTikla.click(); // login tıklayıp Hesabım Sayfasına giriş yaptım.
        Fonksiyon.bekle(2);

        WebElement ordersTikla = driver.findElement(By.xpath("//a[text()='Orders']"));
        ordersTikla.click(); // "Orders" adlı bağlantıya tıkladım.Siparişleri görüntüledim.

        WebElement detailsTikla = driver.findElement(By.cssSelector("input[class='button-2 order-details-button']"));
        detailsTikla.click(); // Sipariş detayını görüntülemek için tıkladım.
        Fonksiyon.bekle(2);

        WebElement pdfinvoice = driver.findElement(By.xpath("//a[text()='PDF Invoice']"));
        pdfinvoice.click(); // PDF InVoice tıklayarak Şipariş Faturasını Bilgisayara indirdim.

        TakesScreenshot syf = (TakesScreenshot) driver;
        File ekranHafizada = syf.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ekranHafizada, new File("ekranGoruntuleri\\screenshot.png"));


        BekleVeKapat();
    }
}
