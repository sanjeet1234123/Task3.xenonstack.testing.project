package StepDefinition;
import org.openqa.selenium.JavascriptExecutor;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Steps3 {
    WebDriver driver;
    @Given("Open the firefox and open the xenonstack home page")
    public void xenonstack_home_page()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User go the websites")
    public void user_go_the_websites()
    {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        driver.get("https://www.xenonstack.com/");
        long startTimeFrontend = (Long) jsExecutor.executeScript("return window.performance.timing.responseStart");
        long endTimeFrontend = (Long) jsExecutor.executeScript("return window.performance.timing.loadEventEnd");
//        long startTimeBackend = (Long) jsExecutor.executeScript("return window.performance.timing.navigationStart");
        long loadTimeFrontend = endTimeFrontend-startTimeFrontend;
        System.out.println("test cases 9");
        System.out.println("Frontend Load Time: " + loadTimeFrontend+ " ms");
//        long loadTimeBackend2 =startTimeFrontend-startTimeBackend;
//        System.out.println("test cases 10");
//        System.out.println("Backend Load Time: " + loadTimeBackend2 + " ms");
    }
    @Then("measure websites load time")
    public void measure_load_time_of()
    {
     driver.close();
    }
}
