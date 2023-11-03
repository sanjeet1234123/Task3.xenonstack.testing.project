package StepDefinition;
import org.openqa.selenium.JavascriptExecutor;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;

public class Steps2 {
    WebDriver driver;
    @Given("Open the firefox then open the xenonstack home page")
    public void user_is_on_the_xenonstack_home_page()
    {
        // Initialize the driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//using implicit wait for all activity
        driver.get("https://www.xenonstack.com/");


    }

    @When("User click contact us")
    public void user_clicks_contact_us()
    {
        WebElement contactUsLink = driver.findElement(By.linkText("CONTACT US"));
        contactUsLink.click();
    }

    @Then("User should be get to the contact us form")
    public void user_should_be_get_to_the_contact_us_form()
    {
        WebElement contactUsFormHeading = driver.findElement(By.xpath("//h3[text()='Contact Us form']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(contactUsFormHeading));
        System.out.println("Test Case 3 Passed");
        driver.close();
    }

    @When("User clicks Xenonstack logo At any Pages")
    public void user_clicks_xenonstack_logo()
    {
    driver.get("https://www.xenonstack.com/contact-us/");
    WebElement xenonstacklogo = driver.findElement(By.xpath("//*[@id=\"xs-header\"]/div/nav/div/ul[1]/li[1]/a/img"));
    xenonstacklogo.click();
    driver.get("https://www.xenonstack.com/enterprise/generative-ai");
    WebElement xenonstacklogo2 = driver.findElement(By.xpath("//*[@id=\"xs-header\"]/div/nav/div/ul[1]/li[1]/a/img"));
    xenonstacklogo2.click();
    driver.get("https://www.xenonstack.com/neural-company/");
    WebElement xenonstacklogo3 = driver.findElement(By.xpath("//*[@id=\"xs-header\"]/div/nav/div/ul[1]/li[1]/a/img"));
    xenonstacklogo3.click();
    driver.get("https://www.xenonstack.com/technology-consulting/");
    WebElement xenonstacklogo4 = driver.findElement(By.xpath("//*[@id=\"xs-header\"]/div/nav/div/ul[1]/li[1]/a/img"));
    xenonstacklogo4.click();
    driver.get("https://www.xenonstack.com/resources");
    WebElement xenonstacklogo5 = driver.findElement(By.xpath("//*[@id=\"xs-header\"]/div/nav/div/ul[1]/li[1]/a/img"));
    xenonstacklogo5.click();
    }

    @Then("User should redirect to home page")
    public void user_should_redirect_to_home_page()
    {
    WebElement contactUsFormHeading = driver.findElement(By.xpath("//*[@id=\"video\"]"));
    System.out.println("Test Case 4 Passed");
    driver.close();
    }
    @When("User click Take the First Step")
    public void user_click_take_the_first_step()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,550)", "");
        WebElement Take_the_First_Step= driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[2]/div/button/a/span"));
        Take_the_First_Step.click();
    }
    @Then("User get to see the content of Take the First Step")
    public void user_get_to_see_the_content_of_the_first_step ()
    {
        WebElement Generative_AI = driver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div/h1"));
        System.out.println("Test Case 5 Passed");
        driver.close();

    }
    @When("User click search buttom and search anythings")
    public void user_click_search_buttom_and_search_anythings()
    {
        WebElement user_click_search_buttom = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[2]/li[2]/img"));
        user_click_search_buttom.click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/div[2]/div/div[1]/div/div/div/div/div/form/input")).sendKeys("Testing");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/div[2]/div/div[1]/div/div/div/div/div/form/input")).sendKeys(Keys.ENTER);
        String strUrl1 = "https://www.xenonstack.com/hs-search-results?term=Testing";
        String strUrl2 = driver.getCurrentUrl();
        if (strUrl1.equals(strUrl2))
        {
            System.out.println("Test Case 6 Passed");
        }
    }

    @Then("Search engine is working properly")
    public void search_engine_is_working_properly()
    {
        driver.close();
    }

    @When("User search try to search something")
    public void user_search_something()
    {
        WebElement user_click_search_buttom = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[2]/li[2]/img"));
        user_click_search_buttom.click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/div[2]/div/div[1]/div/div/div/div/div/form/input")).sendKeys("custom database development services");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/div[2]/div/div[1]/div/div/div/div/div/form/input")).sendKeys(Keys.ENTER);
    }
    @Then("User should get the content of the topic")
    public void user_shoul_get_the_content_of_the_topic()
    {
        WebElement UserGetTheContent = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/ul/li[1]/a"));
        System.out.println("Test Case 7 Passed");
        driver.close();
    }
    @When("User search something which is not present")
    public void user_search_something_which_is_not_present()
    {
        WebElement user_click_search_buttom = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[2]/li[2]/img"));
        user_click_search_buttom.click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/div[2]/div/div[1]/div/div/div/div/div/form/input")).sendKeys("llbyzsa");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/div[2]/div/div[1]/div/div/div/div/div/form/input")).sendKeys(Keys.ENTER);
    }
    @Then("User see no results")
    public void user_see_no_results()
    {
        WebElement UserSeeNoResults = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/ul/div/p[1]"));
        System.out.println("Test Case 8 Passed");
        driver.close();

    }

}
