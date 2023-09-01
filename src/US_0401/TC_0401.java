package US_0401;

import Utility.BaseDriver;
import Utility.Fonksiyon;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class TC_0401 extends BaseDriver {
    @Test
    public void test_orderPlacement(){
        driver.get("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in")));
        Fonksiyon.bekle(2);

        WebElement login = driver.findElement(By.xpath("//a[@href='/login']"));
        login.click();
        Fonksiyon.bekle(2);

        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("testuser123@example.com");
        Fonksiyon.bekle(2);

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Password123");
        Fonksiyon.bekle(2);

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginBtn.click();
        Fonksiyon.bekle(2);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("14.1-inch Laptop")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement laptop = driver.findElement(By.linkText("14.1-inch Laptop"));
        js.executeScript("window.scrollTo(0, 500);");
        laptop.click();
        Fonksiyon.bekle(2);

        WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
        addToCart.click();
        Fonksiyon.bekle(2);

        WebElement eklendi = driver.findElement(By.xpath("//p[@class='content']"));
        String msj = eklendi.getText();
        Assert.assertTrue("Sepete ekleme doğrulanamadı!",eklendi.getText().contains(msj));
        WebElement sepet = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        sepet.click();
        Fonksiyon.bekle(2);

        WebElement urun = driver.findElement(By.xpath("//a[@class='product-name']"));
        String msj2 = urun.getText();
        Assert.assertTrue("Seçilen ürün doğrulanamadı!",urun.getText().contains(msj2));
        WebElement country = driver.findElement(By.xpath("//select[@id='CountryId']"));
        Select ddMenu = new Select(country);
        ddMenu.selectByIndex(1);
        Fonksiyon.bekle(2);

        WebElement state = driver.findElement(By.xpath("//select[@class='state-input']"));
        Select ddMenu2 = new Select(state);
        ddMenu2.selectByIndex(2);
        Fonksiyon.bekle(2);

        WebElement agree = driver.findElement(By.xpath("//input[@id='termsofservice']"));
        agree.click();
        Fonksiyon.bekle(2);

        WebElement checkOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOut.click();
        Fonksiyon.bekle(2);

        WebElement company = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Company']"));
        company.sendKeys("Megatronic Plus");
        Fonksiyon.bekle(2);

        WebElement country2 = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
        Select ddMenu3 = new Select(country2);
        ddMenu3.selectByIndex(1);
        Fonksiyon.bekle(2);

        WebElement state2 = driver.findElement(By.xpath("//select[@id='BillingNewAddress_StateProvinceId']"));
        Select ddMenu4 = new Select(state2);
        ddMenu4.selectByIndex(8);
        Fonksiyon.bekle(2);

        WebElement city = driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']"));
        city.sendKeys("Los Angeles");
        Fonksiyon.bekle(2);

        WebElement adress1 = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']"));
        adress1.sendKeys("3989 Rose Avenue, Kenner, LA");
        Fonksiyon.bekle(2);

        WebElement zipKode = driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"));
        zipKode.sendKeys("70062");
        Fonksiyon.bekle(2);

        WebElement pNumber = driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"));
        pNumber.sendKeys("+1-504-236-5158");
        Fonksiyon.bekle(2);

        WebElement continueBtn = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
        continueBtn.click();
        Fonksiyon.bekle(2);

        WebElement continueBtn2 = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
        continueBtn2.click();
        Fonksiyon.bekle(2);

        WebElement nextDay = driver.findElement(By.xpath("//input[@id='shippingoption_1']"));
        nextDay.click();
        Fonksiyon.bekle(2);

        WebElement continueBtn3 = driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
        continueBtn3.click();
        Fonksiyon.bekle(2);

        WebElement payment = driver.findElement(By.xpath("//input[@id='paymentmethod_2']"));
        payment.click();
        Fonksiyon.bekle(2);

        WebElement continueBtn4 = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
        continueBtn4.click();
        Fonksiyon.bekle(2);

        WebElement kartType = driver.findElement(By.xpath("//select[@id='CreditCardType']"));
        Select ddMenu5 = new Select(kartType);
        ddMenu5.selectByIndex(1);
        Fonksiyon.bekle(2);

        WebElement kartName = driver.findElement(By.xpath("//input[@name='CardholderName']"));
        kartName.sendKeys("Logan Burnage");
        Fonksiyon.bekle(2);

        WebElement kartNumber = driver.findElement(By.xpath("//input[@name='CardNumber']"));
        kartNumber.sendKeys("5543 6423 3213 1889");
        Fonksiyon.bekle(2);

        WebElement dateMonth = driver.findElement(By.xpath("//select[@id='ExpireMonth']"));
        Select ddMenu6 = new Select(dateMonth);
        ddMenu6.selectByIndex(9);
        Fonksiyon.bekle(2);

        WebElement dateYear = driver.findElement(By.xpath("//select[@id='ExpireYear']"));
        Select ddMenu7 = new Select(dateYear);
        ddMenu7.selectByIndex(4);
        Fonksiyon.bekle(2);

        WebElement kartCode = driver.findElement(By.xpath("//input[@name='CardCode']"));
        kartCode.sendKeys("172");
        Fonksiyon.bekle(2);

        WebElement continueBtn5 = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
        continueBtn5.click();
        Fonksiyon.bekle(2);

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        WebElement continueBtn6 = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
        continueBtn6.click();
        Fonksiyon.bekle(2);

        WebElement assertOrder = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        String msj3 = assertOrder.getText();
        Assert.assertTrue("Sipariş doğrulanamadı!",assertOrder.getText().contains(msj3));

        WebElement finish = driver.findElement(By.xpath("//input[@onclick='setLocation('/')']"));
        finish.click();

        BekleVeKapat();
    }
}
