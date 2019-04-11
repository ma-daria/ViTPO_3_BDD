import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestGame {
    @Given("^I Have class Game$")
    public void iHaveClassGame() {
    }

    @When("^I have enteredGame \"([^\"]*)\" as servis operand$")
    public void iHaveEnteredGameAsServisOperand(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I have enteredGame \"([^\"]*)\" as password operand$")
    public void iHaveEnteredGameAsPasswordOperand(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I add passwordGame$")
    public void iAddPasswordGame() {

    }

    @Then("^The result bool shouldGame be \"([^\"]*)\"$")
    public void theResultBoolShouldGameBe(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
