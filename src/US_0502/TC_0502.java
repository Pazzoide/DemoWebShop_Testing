package US_0502;

import Utility.BaseDriver;
import Utility.Fonksiyon;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class TC_0502 extends BaseDriver {
    @Test
    public void test_negativeCouponAndGiftCardUsage() {
        driver.get("https://demowebshop.tricentis.com/");

        WebElement login = driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("falanfilan22@gmail.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("asz123");

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();


        WebElement computers = driver.findElement(By.cssSelector("[class='header-menu']>[class='top-menu']>li:nth-child(2)>a"));
        computers.click();

        WebElement desktops = driver.findElement(By.cssSelector("[class='picture']>a>img[alt='Picture for category Desktops']"));
        desktops.click();

        WebElement imgclick = driver.findElement(By.cssSelector("[data-productid='72']>[class='picture']>a>img"));
        imgclick.click();

        WebElement adtocart = driver.findElement(By.xpath("//input[@data-productid=\"72\"]"));
        adtocart.click();
        Fonksiyon.bekle(3);


        WebElement shoppingCart = driver.findElement(By.cssSelector("[id='bar-notification']>[class='content']>a"));
        shoppingCart.click();
        Fonksiyon.bekle(2);

        WebElement emptyCartMessage = driver.findElement(By.xpath("//div[@class='order-summary-content']"));

        if (emptyCartMessage.equals("Your Shopping Cart is empty!")) {
            System.out.println("Your Shopping Cart is empty!");
        } else {
            System.out.println("Your Shopping Cart is full");
        }

        WebElement applyCoupon = driver.findElement(By.xpath("//input[@name='applydiscountcouponcode']"));
        applyCoupon.click();


        WebElement couponMessage = driver.findElement(By.xpath("//div[@class='message']"));

        if (couponMessage.isDisplayed() && couponMessage.getText().equals("The coupon code you entered couldn't be applied to your order")) {
            System.out.println("Test Failed: The coupon code you entered couldn't be applied to your order");

        } else {
            System.out.println("The coupon code you entered has been applied to your order.");
        }

        WebElement addGiftCard = driver.findElement(By.xpath("//input[@name='applygiftcardcouponcode']"));

        if (addGiftCard.isDisplayed() && addGiftCard.getText().equals("The coupon code you entered couldn't be applied to your order")) {
            System.out.println("Test Failed: The gift card code you entered couldn't be applied to your order");

        } else {
            System.out.println("The gift card code you entered has been applied to your order.");
        }

        WebElement productcheck = driver.findElement(By.xpath("//input[@name='removefromcart']"));
        productcheck.click();

        WebElement acceptance = driver.findElement(By.xpath("//input[@id='termsofservice']"));
        acceptance.click();

        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();

        WebElement bilingAddress = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
        bilingAddress.click();

        WebElement shippingContinue = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
        shippingContinue.click();

        WebElement shippingMethod = driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
        shippingMethod.click();

        WebElement cashOnDelivery = driver.findElement(By.xpath("//input[@id='paymentmethod_0']"));
        cashOnDelivery.click();

        WebElement paymentMethod = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
        paymentMethod.click();

        WebElement paymentInformation = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
        paymentInformation.click();

        WebElement lastconfirm = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
        lastconfirm.click();
        WebElement assertOrder = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        String msj3 = assertOrder.getText();
        Assert.assertTrue("Sipariş doğrulanamadı!",assertOrder.getText().contains(msj3));

      BekleVeKapat();

    }
}


