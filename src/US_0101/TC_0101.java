package US_0101;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0101 extends BaseDriver {
    @Test
    public void test_userAccountCreation(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement registerBtn = driver.findElement(By.xpath("//a[text()='Register']"));
        registerBtn.click();

        WebElement gender = driver.findElement(By.xpath("//input[@id='gender-male']"));
        gender.click();

        WebElement firsName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firsName.sendKeys("Testercan_12");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Testeroglu_1");

        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("123testuser456_12@example.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Password1234_12");

        WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmpassword.sendKeys("Password1234_12");

        WebElement RegisterBtn = driver.findElement(By.xpath("//input[@id='register-button']"));
        RegisterBtn.click();

        WebElement yazi = driver.findElement(By.xpath("//div[@class='result'] "));
        yazi.getText();

        Assert.assertTrue("giriş yapılamadı", yazi.getText().contains("Your registration completed"));
        WebElement continueBtn = driver.findElement(By.xpath("//input[@value='Continue'] "));
        continueBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/"));

        BekleVeKapat();
    }
}
