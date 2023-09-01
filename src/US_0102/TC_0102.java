package US_0102;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TC_0102 extends BaseDriver {
    @Test
    public void test_duplicateEmailRegistration(){
    driver.get("https://demowebshop.tricentis.com/");

        WebElement registerButton1 = driver.findElement(By.xpath("//a[@class='ico-register']"));
        registerButton1.click();

        WebElement gender = driver.findElement(By.xpath("//input[@id='gender-male']"));
        gender.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Kamil");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Haciyev");

        WebElement eMail = driver.findElement(By.xpath("//input[@id='Email']"));
        eMail.sendKeys("kamilhaciyev@mail.ru");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Kamil123");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("Kamil123");

        WebElement registerButton2 = driver.findElement(By.xpath("//input[@id='register-button']"));
        registerButton2.click();

        WebElement messageControl = driver.findElement(By.xpath("//div[@class='validation-summary-errors']//li"));

        Assert.assertTrue("Uyari mesaji gorulmedi!!",messageControl.getText().equals("The specified email already exists"));

        BekleVeKapat();
    }
}
