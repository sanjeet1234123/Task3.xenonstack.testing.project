package StepDefinition;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Steps1 {
    WebDriver driver;

    @Given("Open the firefox and open xenonstack login page")
    public void user_is_on_the_xenonstack_login_page()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://xenonstack.jobs/app/login");
    }

    @When("User enters correct username and password")
    public void enter_Username_Password()
    {
        driver.findElement(By.xpath("//input[@id='tpt_loginUsername']")).sendKeys("xcvcxvzxczcx@gmail.com");
        driver.findElement(By.xpath("//input[@id='tpt_loginPassword']")).sendKeys("Sunita@07");
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginButton']"));
        loginButton.click();
    }

    @Then("User should be logged in successfully")
    public void verify_successful_login()
    {
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Test Case 1 Passed");
        driver.close();
    }

    @When("User enters incorrect username and password")
    public void enter_Incorrect_Username_Password() {
        driver.findElement(By.xpath("//input[@id='tpt_loginUsername']")).sendKeys("incorrect@gmail.com");
        driver.findElement(By.xpath("//input[@id='tpt_loginPassword']")).sendKeys("wrongpassword");
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginButton']"));
        loginButton.click();
    }

    @Then("User should see an error message")
    public void verify_error_message()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.errorText")));
        assert errorMessageElement.getText().equals("Invalid email or password.");// Verify the text of the error message
        System.out.println("Test Case 2 Passed");
        driver.close();
    }
    @When("User enters wrong email and correct password")
    public void user_enter_wrong_email_and_correct_password() {
        driver.findElement(By.xpath("//input[@id='tpt_loginUsername']")).sendKeys("incorrect@gmail.com");
        driver.findElement(By.xpath("//input[@id='tpt_loginPassword']")).sendKeys("Sunita@07");
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginButton']"));
        loginButton.click();
    }

    @Then("User should see an error message1")
    public void verify_error_message1()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.errorText")));
        assert errorMessageElement.getText().equals("Invalid email or password.");// Verify the text of the error message
        System.out.println("Test Case 3 Passed");
        driver.close();
    }
    @When("User enters correct email and wrong password")
    public void user_enter_correct_email_and_wrong_password() {
        driver.findElement(By.xpath("//input[@id='tpt_loginUsername']")).sendKeys("incorrect@gmail.com");
        driver.findElement(By.xpath("//input[@id='tpt_loginPassword']")).sendKeys("Sunita@07");
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginButton']"));
        loginButton.click();
    }

    @Then("User should see an error message2")
    public void verify_error_message2()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.errorText")));
        assert errorMessageElement.getText().equals("Invalid email or password.");
        System.out.println("Test Case 4 Passed");
        driver.close();
    }
}


