//package hellocucumber;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.cucumber.java.en.Then;
//import static org.junit.jupiter.api.Assertions.*;
//
//class IsItFriday {
//    static String isItFriday(String today) {
//        return "Nope";
//    }
//}
//
//public class Stepdefs {
//    private String today;
//    private String actualAnswer;
//
//    @Given("today is Sunday")
//    public void today_is_Sunday() {
//        today = "Sunday";
//    }
//
//    @When("I ask whether it's Friday yet")
//    public void i_ask_whether_it_s_Friday_yet() {
//        actualAnswer = IsItFriday.isItFriday(today);
//    }
//
//    @Then("I should be told {string}")
//    public void i_should_be_told(String expectedAnswer) {
//        assertEquals(expectedAnswer, actualAnswer);
//    }
//}
/////////////////
package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Steps {


    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable
    {
        System.out.println("This Step open the Firefox and launch the application.");
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable
    {
        System.out.println("This step enter the Username and Password on the login page.");
    }

    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable
    {
        System.out.println("This step click on the Reset button.");
    }

}
