package US_0302;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_0302 extends BaseDriver {
    @Test
    public void test_negativeUserLogin(){

        driver.get("https://demowebshop.tricentis.com/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in")));

        WebElement login= driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("");

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("");

        WebElement loginButton= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();

        WebElement errorMessage=driver.findElement(By.xpath("//div[@class='validation-summary-errors']/span[1]"));

        assert errorMessage.isDisplayed() && errorMessage.getText().equals("Login was unsuccessful. Please correct the errors and try again.") :
                "Test Failed: Unsuccessful login message is not displayed.";

        System.out.println("Test Successful: Unsuccessful login message is displayed.");

        BekleVeKapat();
    }

    @Test
    public void test_negativeUserLogin2() {
        driver.get("https://demowebshop.tricentis.com/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in")));

        WebElement login= driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("falanfilan22@gmail.com");

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("");

        WebElement loginButton= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();

        WebElement errorMessage=driver.findElement(By.xpath("//div[@class='validation-summary-errors']/span[1]"));

        assert errorMessage.isDisplayed() && errorMessage.getText().equals("Login was unsuccessful. Please correct the errors and try again.") :
                "Test Failed: Unsuccessful login message is not displayed.";

        System.out.println("Test Successful: Unsuccessful login message is displayed.");

    }

    @Test
    public void test_negativeUserLogin3() {
        driver.get("https://demowebshop.tricentis.com/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in")));

        WebElement login= driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("");

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("asz123");

        WebElement loginButton= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();

        WebElement errorMessage=driver.findElement(By.xpath("//div[@class='validation-summary-errors']/span[1]"));

        assert errorMessage.isDisplayed() && errorMessage.getText().equals("Login was unsuccessful. Please correct the errors and try again.") :
                "Test Failed: Unsuccessful login message is not displayed.";

        System.out.println("Test Successful: Unsuccessful login message is displayed.");

    }

    @Test
    public void test_negativeUserLogin4() {
        driver.get("https://demowebshop.tricentis.com/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in")));

        WebElement login= driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("gecersizeposta@gmail.com");

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("gecersiz123");

        WebElement loginButton= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();

        WebElement errorMessage=driver.findElement(By.xpath("//div[@class='validation-summary-errors']/span[1]"));

        assert errorMessage.isDisplayed() && errorMessage.getText().equals("Login was unsuccessful. Please correct the errors and try again.") :
                "Test Failed: Unsuccessful login message is not displayed.";

        System.out.println("Test Successful: Unsuccessful login message is displayed.");

    }


}
