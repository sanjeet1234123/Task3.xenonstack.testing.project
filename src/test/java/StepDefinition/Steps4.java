package StepDefinition;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class Steps4 {
    WebDriver driver;

    @Given("Open the firefox , open the xenonstack home page")
    public void user_is_on_the_xenonstack_home_page() {
        driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.xenonstack.com/");
    }
    @When("User hover any five heading")
    public void user_hover_any_five_heading()
    {
        Actions action = new Actions(driver);
        WebElement services = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[2]/div[1]/span"));
        action.moveToElement(services).perform();
        WebElement UserShouldAbleToSeeContent = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[2]/div[3]/div/div/div[1]/div[1]/div/div/h3"));
        WebElement Accelerators = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[3]/div[1]/span"));
        action.moveToElement(Accelerators).perform();
        WebElement UserShouldAbleToSeeContent2 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[3]/div[3]/div/div/div[1]/div[1]/div/div/h3"));
        WebElement Industries = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[4]/div[1]/span"));
        action.moveToElement(Industries).perform();
        WebElement UserShouldAbleToSeeContent3 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[4]/div[3]/div/div/div/div[1]/div/div/h3"));
        WebElement Resources = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[5]/div[1]/span"));
        action.moveToElement(Resources).perform();
        WebElement UserShouldAbleToSeeContent4 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[5]/div[3]/div/div/div/div[1]/div/h3"));
        WebElement Company = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[6]/div[1]/span"));
        action.moveToElement(Company).perform();
        WebElement UserShouldAbleToSeeContent5 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[6]/div[3]/div/div/div/div[2]/div/div[2]/ul/li[1]/a/p"));
    }
    @Then("User should able to see five heading topics")
    public void user_should_able_to_see_five_heading_topics ()
    {
        System.out.println("Test cases 11");
        driver.close();
    }
    @When("User hover accelerator heading")
    public void user_hover_any_heading ()throws InterruptedException
    {
        Actions action = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[3]/div[1]/span"));
        action.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[3]/div[3]/div/div/div[2]/div[1]/div/ul/li[1]/a/p"));
        action.moveToElement(subMenu);
        action.click(subMenu).build().perform();
    }
    @Then("User should able to see content of accelerator and click to it")
    public void user_should_able_to_see_content_and_click_to_it() throws InterruptedException
    {
        WebElement UserShould = driver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div/h1"));
        System.out.println("Test cases 12 ");
    }
    @When("User hover services heading")
    public void user_hover_any_heading1()
    {
        Actions action = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[2]/div[1]/span"));
        action.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[2]/div[3]/div/div/div[2]/div[1]/div/ul/li[1]/a/p"));
        action.moveToElement(subMenu);
        action.click(subMenu).build().perform();
    }
    @Then("User should able to see content of services and click to it")
    public void user_should_able_to_see_content1_and_click_to_it()
    {
        WebElement UserShould = driver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div/h1"));
        System.out.println("Test cases 13 ");
    }
    @When("User hover industries heading")
    public void user_hover_industries_heading1()
    {
        Actions action = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[4]/div[1]/span"));
        action.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[4]/div[3]/div/div/div/div[2]/div/div/div[2]/ul/li[1]/a/p"));
        action.moveToElement(subMenu);
        action.click(subMenu).build().perform();
    }
    @Then("User should able to see content of industries1 and click to it")
    public void user_should_able_to_see_content_of_industries1_click_to_it()
    {
        WebElement UserShould = driver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div/h1"));
        System.out.println("Test cases 14 ");
    }
    @When("User hover resources heading")
    public void user_hover_resources_heading1()
    {
        Actions action = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[5]/div[1]/span"));
        action.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[5]/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/ul/li[1]/a/p"));
        action.moveToElement(subMenu);
        action.click(subMenu).build().perform();
    }
    @Then("User should able to see content of industries and click to it")
    public void user_should_able_to_see_content_of_resources_click_to_it()
    {
        WebElement UserShould = driver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div/h1"));
        System.out.println("Test cases 15 ");
    }
    @When("User hover company heading")
    public void user_hover_company_heading1()
    {
        Actions action = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[6]/div[1]/span"));
        action.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[6]/div[3]/div/div/div/div[1]/div/div[2]/ul/li[1]/a/p"));
        action.moveToElement(subMenu);
        action.click(subMenu).build().perform();
    }
    @Then("User should able to see content of company and click to it")
    public void user_should_able_to_see_content_of_company_click_to_it()
    {
        WebElement UserShould = driver.findElement(By.xpath("/html/body/div[2]/section[1]/div[1]/div/h1"));
        System.out.println("Test cases 16 ");
        driver.close();
    }


}